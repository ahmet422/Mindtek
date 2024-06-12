package arraylist3;

public class Employee {

    private String firstName;
    private String lastName;
    private int employeeId;
    private Department department;
    private Job job;

    public Employee(String firstName, String lastName, int employeeId, Department department, Job job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.department = department;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId=" + employeeId +
                ", department=" + department +
                ", job=" + job +
                '}';
    }
}
