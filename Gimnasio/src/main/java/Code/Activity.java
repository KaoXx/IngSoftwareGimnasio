package Code;

import java.sql.Time;
import java.util.Objects;

public class Activity {
    char id;
    char type;
    Time schedule;
    int capacity;
    char room;

    public Activity(char id, char type, Time schedule, int capacity, char room) {
        this.id = id;
        this.type = type;
        this.schedule = schedule;
        this.capacity = capacity;
        this.room = room;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Time getSchedule() {
        return schedule;
    }

    public void setSchedule(Time schedule) {
        this.schedule = schedule;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public char getRoom() {
        return room;
    }

    public void setRoom(char room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Activity)) return false;
        Activity activities = (Activity) o;
        return getId() == activities.getId() && getType() == activities.getType() && getCapacity() == activities.getCapacity() && getRoom() == activities.getRoom() && Objects.equals(getSchedule(), activities.getSchedule());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getSchedule(), getCapacity(), getRoom());
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", type=" + type +
                ", schedule=" + schedule +
                ", capacity=" + capacity +
                ", room=" + room +
                '}';
    }
}
