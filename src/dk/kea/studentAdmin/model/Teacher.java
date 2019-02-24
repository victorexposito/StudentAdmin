package dk.kea.studentAdmin.model;

public class Teacher extends Person{

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }


    @Override
    public String toString() {
        return "Lærer - " +
                "Fornavn: " + getFirstName() + " " +
                "Efternavn: " + getLastName() + " " +
                 "\n" +
                "----------------------------------------------------";
    }


}
