package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap students = populateHashMap();
        displayMenu(students);
//        System.out.println(students);
    }
    public static String usernamesToString(HashMap students) {
        String usernames = "";
        for(Object key : students.keySet()) {
            usernames += "|" + key + "|  ";
        }
        return usernames;
    }
    public static void displayMenu(HashMap students) {
        Input input = new Input();
        displayStudent(students, input.getString(
                """
                        Welcome!

                        Here are the GitHub usernames of our students:

                        %s

                        What student would you like to see more information on?

                        """, usernamesToString(students)));
    }
    public static void displayStudent(HashMap students, String userChoice) {
        if(students.get(userChoice) == null) {
            System.out.format("Student with username \"" + userChoice + "\" doesn't exist.");
        } else System.out.println(students.get(userChoice));
        Input input = new Input();
        if(input.yesNo("\nWould you like to see another student?")) {
            displayMenu(students);
        }
    }
    public static HashMap<String, Student> populateHashMap() {
        HashMap<String, Student> students = new HashMap<>();
        Student matthew = new Student("Matthew", new ArrayList<>(), new HashMap<>());
        matthew.addGrade(98);
        matthew.addGrade(100);
        matthew.addGrade(100);
        matthew.recordAttendance("2022-08-01", "P");
        matthew.recordAttendance("2022-08-02", "P");
        matthew.recordAttendance("2022-08-03", "A");
        matthew.recordAttendance("2022-08-04", "P");
        matthew.recordAttendance("2022-08-05", "P");
        matthew.recordAttendance("2022-08-08", "P");
        Student james = new Student("James", new ArrayList<>(), new HashMap<>());
        james.addGrade(96);
        james.addGrade(100);
        james.addGrade(97);
        james.recordAttendance("2022-08-01", "P");
        james.recordAttendance("2022-08-02", "P");
        james.recordAttendance("2022-08-03", "P");
        james.recordAttendance("2022-08-04", "P");
        james.recordAttendance("2022-08-05", "P");
        james.recordAttendance("2022-08-08", "P");
        Student caleb = new Student("Caleb", new ArrayList<>(), new HashMap<>());
        caleb.addGrade(99);
        caleb.addGrade(99);
        caleb.addGrade(98);
        caleb.recordAttendance("2022-08-01", "P");
        caleb.recordAttendance("2022-08-02", "P");
        caleb.recordAttendance("2022-08-03", "P");
        caleb.recordAttendance("2022-08-04", "P");
        caleb.recordAttendance("2022-08-05", "P");
        caleb.recordAttendance("2022-08-08", "P");
        Student boss = new Student("Boss", new ArrayList<>(), new HashMap<>());
        boss.addGrade(11);
        boss.addGrade(24);
        boss.addGrade(29);
        boss.recordAttendance("2022-08-01", "A");
        boss.recordAttendance("2022-08-02", "P");
        boss.recordAttendance("2022-08-03", "A");
        boss.recordAttendance("2022-08-04", "P");
        boss.recordAttendance("2022-08-05", "P");
        boss.recordAttendance("2022-08-08", "P");
        students.put("matthew-grayson", matthew);
        students.put("james-strickland-iii", james);
        students.put("caleb-r-hollan", caleb);
        students.put("boss-the-dog", boss);
        return students;
    }
}
