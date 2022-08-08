import java.io.PrintStream;
import java.util.Scanner;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Person matthew = new Person("");
        System.out.println(matthew.name);
        matthew.setName("Matthew");
        System.out.println(matthew.getName());
        matthew.sayHello();
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());



    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sayHello() {
        System.out.printf("Hello, %s!%n", name);
    }
}
