package util;

import java.util.Arrays;

public class Person {
    public String firstName;
    public String lastName;
    public Person[] personArray;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {

    }
    public String toString() {
        return firstName + " " + lastName;
    }
    public static Person[] addPerson(Person[] personArray, String firstName, String lastName) {
        int newIndex = personArray.length;
        Person[] newArray = Arrays.copyOf(personArray, newIndex + 1);
        newArray[newIndex] = new Person(firstName, lastName);
        return newArray;
    }
}
