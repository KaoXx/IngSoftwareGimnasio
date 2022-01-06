package Code;

import java.sql.Array;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public class Trainer extends Employee {
    Array freeHours;
    Array reservedHours;

    public Trainer(UUID uid, String dni, String name, String email, String password, Date bDayDate, float salary, int tlfNumber, Array freeHours, Array reservedHours) {
        super(uid, dni, name, email, password, bDayDate, salary, tlfNumber);
        this.freeHours = freeHours;
        this.reservedHours = reservedHours;
    }

    public Array getFreeHours() {
        return freeHours;
    }

    public void setFreeHours(Array freeHours) {
        this.freeHours = freeHours;
    }

    public Array getReservedHours() {
        return reservedHours;
    }

    public void setReservedHours(Array reservedHours) {
        this.reservedHours = reservedHours;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "uid=" + uid +
                ", dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bDayDate=" + bDayDate +
                ", salary=" + salary +
                ", tlfNumber=" + tlfNumber +
                ", freeHours=" + freeHours +
                ", reservedHours=" + reservedHours +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainer)) return false;
        if (!super.equals(o)) return false;
        Trainer trainer = (Trainer) o;
        return Objects.equals(getFreeHours(), trainer.getFreeHours()) && Objects.equals(getReservedHours(), trainer.getReservedHours());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFreeHours(), getReservedHours());
    }
}
