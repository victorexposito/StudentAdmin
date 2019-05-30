package kea.studentAdmin.model;


import java.util.ArrayList;
import java.util.List;

public class Exam {

    private String examName;
    private String dateFormat;
    private String time;
    private String location;
    private List<Student> studentList = new ArrayList<>();

    public Exam(String examName, String dateFormat, String time, String location) {
        this.examName = examName;
        this.dateFormat = dateFormat;
        this.time = time;
        this.location = location;
    }

    public Exam(String examName) {
        this.examName = examName;
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

    public String getTime() {
        return time;
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


    @Override
    public String toString() {
        return "Exam{" +
                "examName='" + examName + '\'' +
                ", dateFormat='" + dateFormat + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", studentList=" + studentList +
                '}';
    }

}
