package Code;

import java.time.LocalDate;
import java.util.UUID;

public class Receptionist extends Employee {
    public Receptionist(UUID uid, char dni, char name, LocalDate bDayDate, float salary, int tlfNumber) {
        super(uid, dni, name, bDayDate, salary, tlfNumber);
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "uid=" + uid +
                ", dni=" + dni +
                ", name=" + name +
                ", bDayDate=" + bDayDate +
                ", salary=" + salary +
                ", tlfNumber=" + tlfNumber +
                '}';
    }
}
