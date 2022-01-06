package Code;
import java.sql.*;


public class Program {
    private static final String URL ="jdbc:postgresql://35.205.101.101:5432/Gimnasio";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";
    private static Connection conn;

    private static void connect() throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    private static void disconnect() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public void SignUp(Employee employee) throws SQLException {

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










}
