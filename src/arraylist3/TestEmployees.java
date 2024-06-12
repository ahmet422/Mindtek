package arraylist3;

public class TestEmployees {

    public static void main(String[] args) {

        System.out.println(EmployeeData.getEmployees());

        System.out.println(EmployeeData.getEmployees().get(0).getDepartment().getName());
        System.out.println(EmployeeData.getEmployees().get(10).getJob().getSalary());

        System.out.println(EmployeeData.getEmployees().get(18).getDepartment().getLocationId());

        // Print Employee first names who work in IT department
        System.out.println("=========");
        for(Employee e: EmployeeData.getEmployees()){
            if(e.getDepartment().getName().equalsIgnoreCase("IT")){
                System.out.println(e.getFirstName());
            }
        }

        // Total salary of employees who works in Finance Department
        System.out.println("===============");
        int sum=0;
        for(Employee e: EmployeeData.getEmployees()){
            if(e.getDepartment().getName().equalsIgnoreCase("Finance")){
                sum+=e.getJob().getSalary();
            }
        }
        System.out.println(sum);

        /*
        1. Print employee ids those that has salary more than average salary.
        2. Print employee first names whose employeeId and departmentId are odd numbers
        3. Print Department name that has most employees.
         */

    }

}
