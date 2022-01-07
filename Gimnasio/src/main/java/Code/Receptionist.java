package Code;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Receptionist extends Employee {
    public Receptionist(String dni, String name, String email, String password, Date bDayDate, float salary, int tlfNumber) {
        super(dni, name, email, password, bDayDate, salary, tlfNumber);
    }

    @Override
    public String toString() {
        return "Receptionist{" +
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
}
