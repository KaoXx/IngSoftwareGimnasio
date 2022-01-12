package Code;

import java.sql.Array;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Cleaner extends Employee {
    Array AssignedAreas;
    String turns; //?

    public Cleaner(UUID uid, String dni, String name, String email, String password, Date bDayDate, float salary, int tlfNumber, Array assignedAreas, String turns) {
        super(dni, name, email, password, bDayDate, salary, tlfNumber);
        AssignedAreas = assignedAreas;
        this.turns = turns;
    }

    public Array getAssignedAreas() {
        return AssignedAreas;
    }

    public void setAssignedAreas(Array assignedAreas) {
        AssignedAreas = assignedAreas;
    }

    public String getTurns() {
        return turns;
    }

    public void setTurns(String turns) {
        this.turns = turns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cleaner)) return false;
        if (!super.equals(o)) return false;
        Cleaner cleaner = (Cleaner) o;
        return Objects.equals(getAssignedAreas(), cleaner.getAssignedAreas()) && Objects.equals(getTurns(), cleaner.getTurns());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAssignedAreas(), getTurns());
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "AssignedAreas=" + AssignedAreas +
                ", turns=" + turns +
                ", uid=" + uid +
                ", dni=" + dni +
                ", name=" + name +
                ", bDayDate=" + bDayDate +
                ", salary=" + salary +
                ", tlfNumber=" + tlfNumber +
                '}';
    }
}
