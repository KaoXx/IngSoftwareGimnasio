package Code;

import java.util.Date;
import java.util.UUID;

public class Activity {
    UUID id;
    String type;
    Date fecha;
    int capacity;
    String room;

    public Activity(UUID id, String type, Date fecha, int capacity, String room) {
        this.id = id;
        this.type = type;
        this.fecha = fecha;
        this.capacity = capacity;
        this.room = room;
    }

    public UUID getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Date getFecha() {
        return fecha;
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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
