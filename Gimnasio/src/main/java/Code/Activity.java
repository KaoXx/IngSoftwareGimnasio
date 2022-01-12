package Code;

import java.util.UUID;

public class Activity {
    UUID id;
    String type;
    String dias;
    String horario;
    int capacity;
    String room;

    public Activity(UUID id, String type, String dias, String horario, int capacity, String room) {
        this.id = id;
        this.type = type;
        this.dias = dias;
        this.horario = horario;
        this.capacity = capacity;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Activity{" + "id=" + id + ", type=" + type + ", dias=" + dias + ", horario=" + horario + ", capacity=" + capacity + ", room=" + room + '}';
    }

    public UUID getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDias() {
        return dias;
    }

    public String getHorario() {
        return horario;
    }

    public String getRoom() {
        return room;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
