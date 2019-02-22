package dk.kea.studentAdmin.model;

public class Student extends Person{

    private String holdNr;

    public Student(String firstName, String lastName, String holdNr) {
        super(firstName, lastName);
        this.holdNr = holdNr;
    }
    //TODO RET HOLDNR SÅ DET STEMMER OVERENS MED COURSE
    @Override
    public String toString() {
        return "Student " +
                "Fornavn: " + getFirstName() + " " +
                "Efternavnet:  " + getLastName() + " " +
                "holdNr: " + holdNr + '\'' + "\n" +
                "----------------------------------------------------";
    }
}
