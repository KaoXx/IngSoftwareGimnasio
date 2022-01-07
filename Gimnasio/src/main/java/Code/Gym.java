package Code;

import utiles.Excepcion;

import javax.swing.*;
import java.sql.*;

public class Gym {
    int id;
    Employee[] employees;
    Member[] members;
    Activity[] activities;
    private static final String URL ="jdbc:postgresql://35.205.101.101:5432/Gimnasio";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";
    private static Connection conn;

    public Gym(int id, Employee[] employees, Member[] members, Activity[] activities) {
        this.id = id;
        this.employees = employees;
        this.members = members;
        this.activities = activities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public Activity[] getActivities() {
        return activities;
    }

    public void setActivities(Activity[] activities) {
        this.activities = activities;
    }


    private static void connect() throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    private static void disconnect() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public void SignUp(Employee employee) throws SQLException {
        connect();
        if(employee instanceof  Monitor){
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Monitor VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            RegularEmployee(employee, stmt);
            stmt.setArray(10,((Monitor) employee).getActivities());
            stmt.setString(11,((Monitor) employee).getSpecialist());
        }else if(employee instanceof Receptionist){
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Recepcionista VALUES (?,?,?,?,?,?,?)");
            RegularEmployee(employee, stmt);
        }else if(employee instanceof  Trainer){
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Entrenador" + " VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            RegularEmployee(employee,stmt);
            stmt.setArray(10,((Trainer) employee).getFreeHours());
            stmt.setArray(11,((Trainer) employee).getReservedHours());
        }else if(employee instanceof Cleaner){
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Limpiador" + " VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            RegularEmployee(employee,stmt);
            stmt.setString(10,((Cleaner) employee).getTurns());
            stmt.setArray(11,((Cleaner) employee).getAssignedAreas());

        }
        disconnect();
    }

    private void RegularEmployee(Employee employee, PreparedStatement stmt) throws SQLException {
        stmt.setString(1,employee.getUid().toString());
        stmt.setString(2,employee.getDni());
        stmt.setString(3,employee.getName());
        stmt.setString(4, employee.getEmail());
        stmt.setString(5,employee.getPassword());
        stmt.setDate(6, (Date) employee.getbDayDate());
        stmt.setFloat(7,employee.getSalary());
        stmt.setInt(8,employee.getTlfNumber());
        stmt.setInt(9,1);
    }
    private void RegularMember(Member member, PreparedStatement stmt) throws SQLException {
        stmt.setString(1,member.getUuid().toString());
        stmt.setInt(2,member.getMemberNumber());
        stmt.setString(3,member.getName());
        stmt.setInt(4, Integer.parseInt(member.getTlfNumber()));
        stmt.setString(5,member.getEmail());
        stmt.setString(6, member.getPassword());
        stmt.setString(7,member.getFeeType());
        stmt.setString(8,member.getBankNumber());
        stmt.setInt(9,1);
        stmt.setString(10,null);
    }

    public void SignUp(Member member) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO Socio VALUES (?,?,?,?,?,?,?,?,?,?)");
        RegularMember(member,stmt);
    }

    public void SignIn(String email,String password) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("SELECT Email,Contrasenna FROM Socio WHERE Email=(?) AND Contrasenna=(?)");
        stmt.setString(1,email);
        stmt.setString(2,password);
        boolean r = true;
        try{
            connect();
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){ //IF USER EXISTS IN DATABASE
                String user = rs.getString("Email");
                String pass = rs.getString("Contrasenna");
                if(user.equals(email) && pass.equals(password)){
                    r = false;
                    JOptionPane.showConfirmDialog(null,"BIENVENIDO DE NUEVO");
                    //ADD THE FOLLOWING INTERFACE -> SOCIO

                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error en la base de datos","ERROR",JOptionPane.ERROR_MESSAGE);
        };
        PreparedStatement stmt1 = conn.prepareStatement("SELECT Email,Contrasenna FROM Entrenador WHERE Email=(?) AND Contrasenna=(?)");
        stmt.setString(1,email);
        stmt.setString(2,password);
        try{
            connect();
            ResultSet rs = stmt1.executeQuery();
            if(rs.next()){ //IF USER EXISTS IN DATABASE
                String user = rs.getString("Email");
                String pass = rs.getString("Contrasenna");
                if(user.equals(email) && pass.equals(password)){
                    r = false;
                    JOptionPane.showConfirmDialog(null,"BIENVENIDO DE NUEVO");
                    //ADD THE FOLLOWING INTERFACE -> ENTRENADOR

                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error en la base de datos","ERROR",JOptionPane.ERROR_MESSAGE);
        };
        PreparedStatement stmt2 = conn.prepareStatement("SELECT Email,Contrasenna FROM Monitor WHERE Email=(?) AND Contrasenna=(?)");
        stmt.setString(1,email);
        stmt.setString(2,password);
        try{
            connect();
            ResultSet rs = stmt2.executeQuery();
            if(rs.next()){ //IF USER EXISTS IN DATABASE
                String user = rs.getString("Email");
                String pass = rs.getString("Contrasenna");
                if(user.equals(email) && pass.equals(password)){
                    r = false;
                    JOptionPane.showConfirmDialog(null,"BIENVENIDO DE NUEVO");
                    //ADD THE FOLLOWING INTERFACE -> MONITOR

                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error en la base de datos","ERROR",JOptionPane.ERROR_MESSAGE);
        };
        PreparedStatement stmt3 = conn.prepareStatement("SELECT Email,Contrasenna FROM Limpiador WHERE Email=(?) AND Contrasenna=(?)");
        stmt.setString(1,email);
        stmt.setString(2,password);
        try{
            connect();
            ResultSet rs = stmt3.executeQuery();
            if(rs.next()){ //IF USER EXISTS IN DATABASE
                String user = rs.getString("Email");
                String pass = rs.getString("Contrasenna");
                if(user.equals(email) && pass.equals(password)){
                    r = false;
                    JOptionPane.showConfirmDialog(null,"BIENVENIDO DE NUEVO");
                    //ADD THE FOLLOWING INTERFACE -> MONITOR

                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error en la base de datos","ERROR",JOptionPane.ERROR_MESSAGE);
        };
        if(r == true){
            JOptionPane.showMessageDialog(null,"El usuario o la contrasenna son erroneos","Error de inicio de sesion",JOptionPane.ERROR_MESSAGE);
        }


    }

}
