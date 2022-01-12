package Code;

import java.sql.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Monitor extends Employee {
    Array Activities;
    String Specialist;

    public Monitor(String dni, String name, String email, String password, Date bDayDate, float salary, int tlfNumber, Array activities, String specialist) {
        super(dni, name, email, password, bDayDate, salary, tlfNumber);
        Activities = activities;
        Specialist = specialist;
    }

    public Array getActivities() {
        return Activities;
    }

    public void setActivities(Array activities) {
        Activities = activities;
    }

    public String  getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String specialist) {
        Specialist = specialist;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "uid=" + uid +
                ", dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", bDayDate=" + bDayDate +
                ", salary=" + salary +
                ", tlfNumber=" + tlfNumber +
                ", Activities=" + Activities +
                ", Specialist='" + Specialist + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return Objects.equals(getActivities(), monitor.getActivities()) && Objects.equals(getSpecialist(), monitor.getSpecialist());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getActivities(), getSpecialist());
    }
}
