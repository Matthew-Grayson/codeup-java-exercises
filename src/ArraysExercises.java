import java.util.Arrays;
import util.Person;

public class ArraysExercises {
    public static void main(String[] args) {
        Person matthew = new Person("Matthew", "Grayson");
        Person james = new Person("James", "Strickland");
        Person caleb = new Person("Caleb", "Hollan");
        Person[] personArray = {matthew, james, caleb};
        personArray = Person.addPerson(personArray, "Boss", "Grayson");
        for(Person person : personArray) {
            System.out.println(person);
        }
    }
}
