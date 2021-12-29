package Code;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Monitor extends Employee {
    char [] Activities;
    char Specialist;

    public Monitor(UUID uid, char dni, char name, LocalDate bDayDate, float salary, int tlfNumber, char[] activities, char specialist) {
        super(uid, dni, name, bDayDate, salary, tlfNumber);
        Activities = activities;
        Specialist = specialist;
    }

    public char[] getActivities() {
        return Activities;
    }

    public void setActivities(char[] activities) {
        Activities = activities;
    }

    public char getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(char specialist) {
        Specialist = specialist;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "uid=" + uid +
                ", dni=" + dni +
                ", name=" + name +
                ", bDayDate=" + bDayDate +
                ", salary=" + salary +
                ", tlfNumber=" + tlfNumber +
                ", Activities=" + Arrays.toString(Activities) +
                ", Specialist=" + Specialist +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return getSpecialist() == monitor.getSpecialist() && Arrays.equals(getActivities(), monitor.getActivities());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), getSpecialist());
        result = 31 * result + Arrays.hashCode(getActivities());
        return result;
    }
}
