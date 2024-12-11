import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class HandsOnArrayList {
    public static void main(String[] args) {
        List<String> studentNames= new ArrayList<>();

        studentNames.add("Jane");
        studentNames.add("Emily");
        studentNames.add("Marie");
        studentNames.add("David");
        studentNames.add("Eve");

        System.out.println("Names of the Student : "+studentNames);

        studentNames.remove("Marie");
        System.out.println("Updated List after Removal: "+studentNames);

        System.out.println("Iterating List of Students:  ");
        for(String student: studentNames) {
            System.out.println(student);
        }
        Collections.sort(studentNames);

        System.out.println("Sorted List of Students: "+studentNames);
    }

}
