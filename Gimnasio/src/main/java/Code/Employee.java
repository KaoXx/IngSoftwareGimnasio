package Code;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;
public class Employee {
    UUID uid;
    char dni;
    char name;
    LocalDate bDayDate;
    float salary;
    int tlfNumber;

    public Employee(UUID uid, char dni, char name, LocalDate bDayDate, float salary, int tlfNumber) {
        this.uid = UUID.randomUUID();
        this.dni = dni;
        this.name = name;
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

    public char getDni() {
        return dni;
    }

    public void setDni(char dni) {
        this.dni = dni;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public LocalDate getbDayDate() {
        return bDayDate;
    }

    public void setbDayDate(LocalDate bDayDate) {
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

    @Override
    public String toString() {
        return "Empleado{" +
                "uid=" + uid +
                ", dni=" + dni +
                ", name=" + name +
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
        return getDni() == employee.getDni() && getName() == employee.getName() && Float.compare(employee.getSalary(), getSalary()) == 0 && getTlfNumber() == employee.getTlfNumber() && Objects.equals(getUid(), employee.getUid()) && Objects.equals(getbDayDate(), employee.getbDayDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUid(), getDni(), getName(), getbDayDate(), getSalary(), getTlfNumber());
    }
}
