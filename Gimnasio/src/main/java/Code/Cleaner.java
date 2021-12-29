package Code;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Cleaner extends Employee {
    Enum AssignedAreas;
    Time turns; //?

    public Cleaner(UUID uid, char dni, char name, LocalDate bDayDate, float salary, int tlfNumber, Enum assignedAreas, Time turns) {
        super(uid, dni, name, bDayDate, salary, tlfNumber);
        AssignedAreas = assignedAreas;
        this.turns = turns;
    }

    public Enum getAssignedAreas() {
        return AssignedAreas;
    }

    public void setAssignedAreas(Enum assignedAreas) {
        AssignedAreas = assignedAreas;
    }

    public Time getTurns() {
        return turns;
    }

    public void setTurns(Time turns) {
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
