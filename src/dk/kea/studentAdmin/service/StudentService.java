package kea.studentAdmin.service;

import kea.studentAdmin.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StudentService {


    private static StudentService mySelf = new StudentService();


    private List<Student> students = new ArrayList<>();



    private StudentService() {
    }


    public static StudentService getStudentService() {
        return mySelf;
    }


    public boolean addStudent(Student student) {
        return students.add(student);
    }


    public Student getStudent(String name)
    {
        for(Student s : students)
        {
            if(name.equals(s.getFirstName())) return s;

        }

        return null;
    }

    public void removeStudent(String name)
    {
        Student s = getStudent(name);
        students.remove(s);
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
