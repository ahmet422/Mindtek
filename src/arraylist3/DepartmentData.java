package arraylist3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentData {

    private static List<Department> departments=new ArrayList<>();

    static {
        try {
            FileReader file = new FileReader("/Users/mindtekjava/IdeaProjects/MindtekJavaProject/src/arraylist3/Departments.csv");
            BufferedReader br = new BufferedReader(file);

            String line=br.readLine();

            while (line != null) {
                // 10,Administration,1700
                String[] words = line.split(",");
                // words=["10","Administration","1700"]
                Department department = new Department(Integer.parseInt(words[0]), words[1], Integer.parseInt(words[2]));
                departments.add(department);
                line=br.readLine();
            }
        }catch (IOException e){}
    }

    public static List<Department> getDepartments(){
        return departments;
    }

}
