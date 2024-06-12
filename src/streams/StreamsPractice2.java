package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice2 {

    public static void main(String[] args) {

        Parent parent1=new Parent("John Doe",'M',new ArrayList<>(List.of("Bob","Richard","Michael")));
        Parent parent2=new Parent("Patel Harsh",'M',new ArrayList<>(List.of("Srikkanth","Sumathi","Suresh")));
        Parent parent3=new Parent("Kate Peterson",'F',new ArrayList<>(List.of("Jessica","Charles")));

        List<Parent> parents=List.of(parent1,parent2,parent3);

        // Store names of children in list of Strings

        List<String> children=parents.stream()
                .flatMap(x -> x.getChildren().stream())
                .collect(Collectors.toList());

        System.out.println(children);

        // Get first kid name into list of every Male parent

        List<String> firstKidOfMaleParents = parents.stream()
                .filter(x -> x.getGender()=='M')
                .flatMap(x -> Stream.of(x.getChildren().get(0)))
                .collect(Collectors.toList());

        System.out.println(firstKidOfMaleParents);

        // Get parents first names has children name starts with letter 'C'

        List<String> parentNames = parents.stream()
                .filter(x -> x.getChildren().stream().filter(child->child.startsWith("C")).count()>=1)
                .map(x-> x.getName().split(" ")[0])
                .collect(Collectors.toList());

        System.out.println(parentNames);

    }

}
