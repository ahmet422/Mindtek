package encapsulation;

public class Employee {

    private String name;
    private int employeeId;
    private Department department;

    public Employee(String name, int employeeId, Department department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", department=" + department +
                '}';
    }
}
