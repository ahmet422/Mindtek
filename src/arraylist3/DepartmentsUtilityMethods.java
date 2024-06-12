package arraylist3;

import java.util.ArrayList;
import java.util.List;

public class DepartmentsUtilityMethods {

    /**
     * Method returns list of department names that located in same location.
     *
     * Example:
     *  .getDepartmentsFromLocation(departments,1700); -> return ["Administration", "Purchasing"...]
     */
    public static List<String> getDepartmentsFromLocation(List<Department> departments, int locationId){
        List<String> names=new ArrayList<>();
        for(Department d: departments){
            if(d.getLocationId()==locationId){
                names.add(d.getName());
            }
        }
        return names;
    }

    /**
     * Method returns department object of passed departmentId.
     *
     * Example:
     *  .getDepartmentById(departments, 100); -> return department[100,"Finance",1700]
     */
    public static Department getDepartmentById(List<Department> departments, int departmentId){
        for(Department d: departments){
            if(d.getDepartmentId()==departmentId){
                return d;
            }
        }
        return null;
    }

}
















