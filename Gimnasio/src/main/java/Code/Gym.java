package Code;

public class Gym {
    int id;
    Employee[] employees;
    Member[] members;
    Activity[] activities;

    public Gym(int id, Employee[] employees, Member[] members, Activity[] activities) {
        this.id = id;
        this.employees = employees;
        this.members = members;
        this.activities = activities;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public Activity[] getActivities() {
        return activities;
    }

    public void setActivities(Activity[] activities) {
        this.activities = activities;
    }
}
