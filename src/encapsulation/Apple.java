package encapsulation;

public class Apple {

    public static void main(String[] args) {

        Department department1=new Department("IT",1,"Cupertino CA");
        Department department2=new Department("Finance",2,"Austin TX");
        Department department3=new Department("HR",3,"Austin TX");

        Employee employee1=new Employee("John Doe",101,department1);
        Employee employee2=new Employee("Patel Harsh",102,department2);
        Employee employee3=new Employee("Kim Yan",103,department2);
        Employee employee4=new Employee("Kate Connor",104,department3);
        Employee employee5=new Employee("Brad Pitt",105,department1);

        Employee[] employees={employee1,employee2,employee3,employee4,employee5};

        // John Doe works in IT department
        for(Employee e : employees){
            System.out.println(e.getName()+" works in "+e.getDepartment().getName()+" department.");
        }

        System.out.println("=============");
        // Print employees id who works in IT department
        for (Employee e: employees){
            if(e.getDepartment().getName().equalsIgnoreCase("IT"))
                System.out.println(e.getEmployeeId());
        }

        // Count number of employees who works in Austin TX

        int count=0;
        for(Employee e: employees){
            if(e.getDepartment().getLocation().equalsIgnoreCase("Austin TX"))
                count++;
        }

        System.out.println("Number of employees work in Austin: "+count);

        // Find out employees who have employeeId and departmentId as even number
        // Find out employees who work in Cupertino and employee first name has more than 5 chars

        System.out.println("================");

        for (Employee e : employees){
            if(e.getEmployeeId()%2==0 && e.getDepartment().getDepartmentId()%2==0)
                System.out.println(e.getName());
        }

        System.out.println("==============");

        for(Employee e: employees){

            String firstName=e.getName().split(" ")[0]; // [John, Doe]

            if(e.getDepartment().getLocation().equalsIgnoreCase("Cupertino CA")
                    //   John Doe  [John, Doe]    John   4     >=5  -> false
                    && e.getName().split(" ")[0].length()>=4){
                System.out.println(e.getName());
            }
        }


    }

}
