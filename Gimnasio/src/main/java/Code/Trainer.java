package Code;

import java.sql.Time;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public class Trainer extends Employee {
    char freeHours;
    HashMap <Employee, Time> reservedHours;

    public Trainer(UUID uid, char dni, char name, LocalDate bDayDate, float salary, int tlfNumber, char freeHours, HashMap<Employee, Time> reservedHours) {
        super(uid, dni, name, bDayDate, salary, tlfNumber);
        this.freeHours = freeHours;
        this.reservedHours = reservedHours;
    }

    public char getFreeHours() {
        return freeHours;
    }

    public void setFreeHours(char freeHours) {
        this.freeHours = freeHours;
    }

    public HashMap<Employee, Time> getReservedHours() {
        return reservedHours;
    }

    public void setReservedHours(HashMap<Employee, Time> reservedHours) {
        this.reservedHours = reservedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainer)) return false;
        if (!super.equals(o)) return false;
        Trainer trainer = (Trainer) o;
        return getFreeHours() == trainer.getFreeHours() && Objects.equals(getReservedHours(), trainer.getReservedHours());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFreeHours(), getReservedHours());
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "uid=" + uid +
                ", dni=" + dni +
                ", name=" + name +
                ", bDayDate=" + bDayDate +
                ", salary=" + salary +
                ", tlfNumber=" + tlfNumber +
                ", freeHours=" + freeHours +
                ", reservedHours=" + reservedHours +
                '}';
    }
}
