package encapsulation;

public class Department {

    private String name;
    private int departmentId;
    private String location;

    public Department(String name, int departmentId, String location) {
        this.name = name;
        this.departmentId = departmentId;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", location='" + location + '\'' +
                '}';
    }

}
