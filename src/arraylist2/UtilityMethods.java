package arraylist2;

import java.util.ArrayList;
import java.util.List;

public class UtilityMethods {

    /**
     * This method will take program id as parameter and returns students who attend that program.
     *
     * Example:
     *  .getStudents(students,101); -> return list of students
     */
    public static List<Student> getStudents(List<Student> students, int programId){
        List<Student> studentList=new ArrayList<>();
        for(Student s: students){
            if(s.getProgram().getId() == programId){
                studentList.add(s);
            }
        }
        return studentList;
    }

    /**
     * Method returns List of classes for a provided program.
     *
     * Example:
     *  .getClasses(programs, "Java Development"); -> return list of classes (Java, Java Streams, Generics....)
     */
    public static List<String> getClasses(List<Program> programs, String programName){
        for(Program p: programs){
            if(p.getName().equalsIgnoreCase(programName)){
                return p.getClasses();
            }
        }
        return null;
    }

    /**
     * Method takes list of students and location of student as parameters
     * and returns list of ids of students who studies from that location.
     *
     * Example:
     *  .getStudentIds(students, "Chicago IL"); returns [1]
     */

    public static List<Integer> getStudentIds(List<Student> students, String location){
        List<Integer> ids=new ArrayList<>();

        for(Student s: students){
            if(s.getLocation().equalsIgnoreCase(location)){
                ids.add(s.getId());
            }
        }
        return ids;

    }


}

















