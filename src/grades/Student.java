package grades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, Student> student;
    private HashMap<String, String> attendance;

    public Student(String name, ArrayList<Integer> grades, HashMap<String, Student> student) {
        this.name = name;
        this.grades = grades;
        this.student = student;
    }

    public Student(String name, ArrayList<Integer> grades, HashMap<String, Student> student, HashMap<String, String> attendance) {
        this.name = name;
        this.grades = grades;
        this.student = student;
        this.attendance = attendance;
    }

    // returns the student's name
    public String getName() {
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    };

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        int gLen = grades.size();
        for(int i = 0; i < gLen; i++) {
            sum += grades.get(i);
        }
        return sum / gLen;
    }
    public void recordAttendance(String date, String value) {
        attendance.put(date, value);
    }
    public String getAttendance() {
        int aLen = attendance.size();
        int absences = Collections.frequency(attendance.values(), "A");
        return ((double)(aLen - absences) / aLen * 100) + "%";
    }

    @Override
    public String toString() {
        return "\nName: " + name +
                "\nAverage Grade: " + getGradeAverage() +
                "\nAttendance: " + getAttendance();
    }
}
