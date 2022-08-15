package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {
        Student matthew = new Student("Matthew", new ArrayList<>(), new HashMap<>());
        matthew.addGrade(98);
        matthew.addGrade(100);
        System.out.println(matthew.getGradeAverage());


    }
}
