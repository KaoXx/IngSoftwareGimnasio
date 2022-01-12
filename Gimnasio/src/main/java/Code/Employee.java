package Code;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
public class Employee {
    UUID uid;
    String dni;
    String name,email,password;
    Date bDayDate;
    float salary;
    int tlfNumber;

    public Employee(String dni, String name,String email,String password, Date bDayDate, float salary, int tlfNumber) {
        uid = UUID.randomUUID();
        this.dni = dni;
        this.name = name;
        this.email = email;
        this.password = password;
        this.bDayDate = bDayDate;
        this.salary = salary;
        this.tlfNumber = tlfNumber;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getbDayDate() {
        return bDayDate;
    }

    public void setbDayDate(Date bDayDate) {
        this.bDayDate = bDayDate;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getTlfNumber() {
        return tlfNumber;
    }

    public void setTlfNumber(int tlfNumber) {
        this.tlfNumber = tlfNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "uid=" + uid +
                ", dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bDayDate=" + bDayDate +
                ", salary=" + salary +
                ", tlfNumber=" + tlfNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Float.compare(employee.getSalary(), getSalary()) == 0 && getTlfNumber() == employee.getTlfNumber() && Objects.equals(getUid(), employee.getUid()) && Objects.equals(getDni(), employee.getDni()) && Objects.equals(getName(), employee.getName()) && Objects.equals(getEmail(), employee.getEmail()) && Objects.equals(getPassword(), employee.getPassword()) && Objects.equals(getbDayDate(), employee.getbDayDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUid(), getDni(), getName(), getEmail(), getPassword(), getbDayDate(), getSalary(), getTlfNumber());
    }
}
