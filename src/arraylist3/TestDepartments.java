package arraylist3;

public class TestDepartments {

    public static void main(String[] args) {

        System.out.println(DepartmentData.getDepartments());
        System.out.println(DepartmentsUtilityMethods.getDepartmentsFromLocation(DepartmentData.getDepartments(),1700));
        System.out.println(DepartmentsUtilityMethods.getDepartmentsFromLocation(DepartmentData.getDepartments(),1800));

        System.out.println(DepartmentsUtilityMethods.getDepartmentById(DepartmentData.getDepartments(),100));
    }

}
