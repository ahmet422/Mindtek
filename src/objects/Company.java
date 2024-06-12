package objects;

public class Company {

    public static void main(String[] args) {
        Employee employee1=new Employee("John",101,true,' ');

        Employee employee2=new Employee("Patel",102,true,'M');

        Employee employee3=new Employee("Kim",103,false, 'M');

        Employee employee4=new Employee("Sarah",104,false,'F');

        Employee employee5=new Employee("Srinivasan", 105, true,'M');

        Employee employee6=new Employee("Li", 105, true,'M');
        Employee employee7=new Employee();
        System.out.println(employee7.gender);

        Employee[] employees={employee1,employee2,employee3,employee4,employee5,employee6};

        // Print names of employees whose name contains letter 'a' or 'e' and has id as even number
        for(Employee e: employees){
            if( ( e.name.toLowerCase().contains("a") || e.name.toLowerCase().contains("e") ) && e.id%2==0){
                System.out.println(e.name);
            }
        }

        // Print last three character of names of male employees who works remotely

        for(Employee e: employees){
            if(e.isRemote && e.gender=='M' && e.name.length()>2){
                System.out.println(e.name.substring(e.name.length()-3));
            }
        }

    }

}
