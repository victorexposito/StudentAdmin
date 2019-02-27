package dk.kea.studentAdmin.service;

import dk.kea.studentAdmin.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Student service - singleton pattern
    Holds the student data and provides operation on student.
 */
public class StudentService {

    /*
    The instance. There can be only one.
     */
    private static StudentService mySelf = new StudentService();

    /*
    The list of student
     */
    private List<Student> students = new ArrayList<>();

    /*
    private constructor to avoid creation from outside the class
     */

    private StudentService() {
    }

    /*
    Return the one and only instance
     */
    public static StudentService getStudentService() {
        return mySelf;
    }

    /**
     * add a student
     * @param student
     * @return
     */
    public boolean addStudent(Student student) {
        return students.add(student);
    }

    /**
     * remove s from student list - list methods for finding an object relies on equals method !!!
     * @param s
     * @return
     */
    public boolean removeStudent(Student s) {

        return students.remove(s);
    }

    /**
     *
     * @return the student list. Only for viewing
     */
    public List<Student> getStudentList() {
        return new ArrayList<>(students);
    }

    public void printList(){
        for(int i = 0; i< getStudentList().size(); i++){
            System.out.println(getStudentList().get(i));
        }
    }

    /**
     *
     * Return a specific student based on the indentifier( to be determined)
     * @param identifier (rename)
     * @return
     */
    public Student getBySomeIndentifier(Object identifier) {
        //TODO implement
        return null;
    }

    public void printStudents()  //prints tpList
    {
        for(Student s : students)
        {
            System.out.printf("%-5s%-5s%n", s.getFirstName(),s.getLastName());

        }
    }
}
