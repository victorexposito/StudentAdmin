package dk.kea.studentAdmin.model;


import java.util.ArrayList;
import java.util.List;

public class Exam {

    private String examName;
    private String dateFormat;
    private int time;
    private String course;
    private String location;
    private List<Student> studentList = new ArrayList<>();

    public Exam(String examName, String dateFormat, int time, String course, String location) {
        this.examName = examName;
        this.dateFormat = dateFormat;
        this.time = time;
        this.course = course;
        this.location = location;
    }

    public Exam() {

    }

    public boolean addStudent(Student student) {
        return studentList.add(student);
    }

    public boolean removeStudent(Student student) {
        return studentList.remove(student);
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public int getTime() {
        return time;
    }

    public String getCourse() {
        return course;
    }

    public String getLocation() {
        return location;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getExamName() {
        return examName;
    }
}
