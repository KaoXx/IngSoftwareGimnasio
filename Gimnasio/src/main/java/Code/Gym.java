package Code;

import utiles.Excepcion;

import javax.swing.*;
import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.UUID;

public class Gym {

    private int id;
    
    private static ArrayList<Employee> employees = new ArrayList();
    private static ArrayList<Member> members = new ArrayList();
    private static ArrayList<Activity> activities = new ArrayList();
    private static Member memberlogged;
    
    private static final String URL = "jdbc:postgresql://35.205.101.101:5432/Gimnasio";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";
    private static Connection conn;

    public Gym() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static void connect() throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private static void disconnect() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public static void cargarActividades() throws SQLException {
        activities = new ArrayList<>();
        
        connect();

        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM \"ActividadColectiva\"");
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            String uuid = rs.getArray("uuid").toString();
            String tipo = rs.getArray("Tipo").toString();
            String horario = rs.getArray("Horario").toString();
            String fecha = rs.getArray("Fecha").toString();
            int capacidad = Integer.parseInt(rs.getArray("AforoMax").toString());
            String sala = rs.getArray("Sala").toString();
            
            Activity actividad = new Activity(UUID.fromString(uuid), tipo, fecha, horario, capacidad, sala);

            activities.add(actividad);
        }

        disconnect();
    }
    
    public static ArrayList<Activity> getMisActividades() throws SQLException{
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        connect();

        String consult = "SELECT \"uuidactividad\" FROM \"many_socios_has_many_actividades\" WHERE \"uuidsocio\"=?";

        ps = conn.prepareStatement(consult);
        ps.setObject(1, memberlogged.getUuid());

        rs = ps.executeQuery();
       
        ArrayList<UUID> listaUid = new ArrayList();
        ArrayList<Activity> listaActividades = new ArrayList();
        while (rs.next()) { //IF USER EXISTS IN DATABASE
                listaUid.add(UUID.fromString(rs.getString("uuidactividad")));
        }

        disconnect();
        
        for(int i=0; i<listaUid.size(); i++){
            for(Activity actividad:activities){
                if(listaUid.get(i).toString().equals(actividad.getId().toString())){
                    listaActividades.add(actividad);
                }
            }
        }
        return listaActividades;
    }
    
    public static void reservarActividad(Activity actividad) throws SQLException{
        connect();

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO \"many_socios_has_many_actividades\" VALUES (?,?)");
        
        stmt.setObject(1, memberlogged.getUuid());
        stmt.setObject(2, actividad.getId());
        
        stmt.execute();

        disconnect();
    }
    
    public static ArrayList<Activity> getActividadesPorTipo(String tipo){
        ArrayList<Activity> actividadesTipo = new ArrayList();
        for(Activity actividad : activities){
            if(actividad.type.equals(tipo)){
                actividadesTipo.add(actividad);
            }
        }
        return actividadesTipo;
    }

    public static void SignUp(Employee employee) throws SQLException {
        connect();
        if (employee instanceof Monitor) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Monitor VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            RegularEmployee(employee, stmt);
            stmt.setArray(10, ((Monitor) employee).getActivities());
            stmt.setString(11, ((Monitor) employee).getSpecialist());
        } else if (employee instanceof Receptionist) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Recepcionista VALUES (?,?,?,?,?,?,?)");
            RegularEmployee(employee, stmt);
        } else if (employee instanceof Trainer) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Entrenador" + " VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            RegularEmployee(employee, stmt);
            stmt.setArray(10, ((Trainer) employee).getFreeHours());
            stmt.setArray(11, ((Trainer) employee).getReservedHours());
        } else if (employee instanceof Cleaner) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Limpiador" + " VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            RegularEmployee(employee, stmt);
            stmt.setString(10, ((Cleaner) employee).getTurns());
            stmt.setArray(11, ((Cleaner) employee).getAssignedAreas());

        }
        disconnect();
    }

    private static void RegularEmployee(Employee employee, PreparedStatement stmt) throws SQLException {
        stmt.setObject(1, employee.getUid());
        stmt.setString(2, employee.getDni());
        stmt.setString(3, employee.getName());
        stmt.setString(4, employee.getEmail());
        stmt.setString(5, employee.getPassword());
        stmt.setDate(6, (Date) employee.getbDayDate());
        stmt.setFloat(7, employee.getSalary());
        stmt.setInt(8, employee.getTlfNumber());
        stmt.setInt(9, 1);
    }

    private static void RegularMember(Member member, PreparedStatement stmt) throws SQLException {
        UUID uuid = UUID.randomUUID();
        member.setUuid(uuid);
        stmt.setObject(1, uuid);
        stmt.setInt(2, member.getMemberNumber());
        stmt.setString(3, member.getName());
        stmt.setInt(4, Integer.parseInt(member.getTlfNumber()));
        stmt.setString(5, member.getEmail());
        stmt.setString(6, member.getPassword());
        stmt.setString(7, member.getFeeType());
        stmt.setString(8, member.getBankNumber());
        stmt.setInt(9, 1);
        stmt.setObject(10, null);
        stmt.setObject(11, null);
        stmt.setString(12,member.getTipoCuenta());
    }

    public static void SignUp(Member member) throws SQLException {
        connect();
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO \"Socio\" VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        RegularMember(member, stmt);
        try {
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
        Retorna 0 si es un socio, 1 si es un entrenador, 2 si es un monitor, 3 si es un limpiador y -1 si ha sucedido algun error o no coinciden las credenciales.
     */
    public static int SignIn(String email, String password) throws SQLException {
        connect();
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean r = true;
        try {
            String consult = "SELECT * FROM \"Socio\" WHERE \"Email\"=? AND \"Contrasenna\" =?";
            ps = conn.prepareStatement(consult);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) { //IF USER EXISTS IN DATABASE
                String user = rs.getString("Email");
                String pass = rs.getString("Contrasenna");
                if (user.equals(email) && pass.equals(password)) {
                    r = false;
                    
                    Member socio = new Member(
                            UUID.fromString(rs.getString("UUID")),
                            Integer.parseInt(rs.getString("NumeroSocio")),
                            rs.getString("Nombre"),
                            rs.getString("Telefono"),
                            rs.getString("Email"),
                            rs.getString("NumeroCuentaBancaria"),
                            rs.getString("TipoCuota"),
                            rs.getString("Contrasenna"),
                            rs.getString("Tipo de Cuenta"),
                            null
                    );
                    memberlogged = socio;

                    return 0;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.out.println(e.toString());
        };

        try {
            String consult = "SELECT \"Email\",\"Contrasenna\"FROM \"Entrenador\" WHERE \"Email\"=? AND \"Contrasenna\" =?";
            ps = conn.prepareStatement(consult);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) { //IF USER EXISTS IN DATABASE
                String user = rs.getString("Email");
                String pass = rs.getString("Contrasenna");
                if (user.equals(email) && pass.equals(password)) {
                    r = false;

                    return 1;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        };
        try {
            String consult = "SELECT \"Email\",\"Contrasenna\"FROM \"Monitor\" WHERE \"Email\"=? AND \"Contrasenna\" =?";
            ps = conn.prepareStatement(consult);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) { //IF USER EXISTS IN DATABASE
                String user = rs.getString("Email");
                String pass = rs.getString("Contrasenna");
                if (user.equals(email) && pass.equals(password)) {
                    r = false;

                    return 2;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        };
        try {
            String consult = "SELECT \"Email\",\"Contrasenna\"FROM \"Limpiador\" WHERE \"Email\"=? AND \"Contrasenna\" =?";
            ps = conn.prepareStatement(consult);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            if (rs.next()) { //IF USER EXISTS IN DATABASE
                String user = rs.getString("Email");
                String pass = rs.getString("Contrasenna");
                if (user.equals(email) && pass.equals(password)) {
                    r = false;

                    return 3;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        };
        if (r == true) {
            JOptionPane.showMessageDialog(null, "El usuario o la contrasenna son erroneos", "Error de inicio de sesion", JOptionPane.ERROR_MESSAGE);
        }
        return -1;
    }

    public static void setLoggedUser(Member member) {
        memberlogged = member;
    }

    public static ArrayList<Activity> getActivities() {
        return activities;
    }

}
