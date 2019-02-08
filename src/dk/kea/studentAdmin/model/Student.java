package dk.kea.studentAdmin.model;

public class Student extends Person{

    private String holdNr;

    public Student(String firstName, String lastName, String holdNr) {
        super(firstName, lastName);
        this.holdNr = holdNr;
    }
}
