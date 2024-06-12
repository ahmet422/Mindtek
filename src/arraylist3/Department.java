package arraylist3;

public class Department {

    private int departmentId;
    private String name;
    private int locationId;

    public Department(int departmentId, String name, int locationId) {
        this.departmentId = departmentId;
        this.name = name;
        this.locationId = locationId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", locationId=" + locationId +
                '}';
    }
}
