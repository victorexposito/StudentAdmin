package dk.kea.studentAdmin.model;

import jdk.nashorn.internal.objects.annotations.Constructor;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Assignment> assignmentList = new ArrayList<>();


    public Course() {
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }


    public void removeStudent(Student s){
        studentList.remove(s);
    }

    public void removeTeacher(Teacher t){
        teacherList.remove(t);
    }

    public void removeAssignment(Assignment a){
        assignmentList.remove(a);
    }


    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void addTeacher( Teacher t) {
        teacherList.add(t);
    }

    public void addAssignment( Assignment a) {
        assignmentList.add(a);
    }


    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", studentList=" + studentList +
                ", teacherList=" + teacherList +
                ", assignmentList=" + assignmentList +
                '}';
    }
}
