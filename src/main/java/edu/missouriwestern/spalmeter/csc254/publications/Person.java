package edu.missouriwestern.spalmeter.csc254.publications;

import java.time.LocalDateTime;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private String middleName;
    private int id;
    private LocalDateTime entered;//date first entered the system
    private static int lastId = 10000;

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.entered = LocalDateTime.now();
        this.id = ++lastId;
    }
    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getEntered() {
        return entered;
    }
    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        String result = String.format("%s %s %s", firstName, middleName, lastName);
        return result;
    }
    public String bibliographic() {
        return String.format("%s, %s, %s", lastName, middleName, firstName);
    }

    @Override
    public int compareTo(Person other) {
        int result = 0;
        result = this.bibliographic().compareToIgnoreCase(other.bibliographic());
        if(result == 0)
            result = this.id -other.id;
        return result;
    }
}
