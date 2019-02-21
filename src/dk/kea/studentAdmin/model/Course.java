package dk.kea.studentAdmin.model;

import java.util.List;

public class Course {
    private String courseName;
    private List<Teacher> teacherlist;
    private List<Student> studentList;
    private List<Assignment> assignmentList;


    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Teacher> getTeacherlist() {
        return teacherlist;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void addStudent(Teacher teacher){
        teacherlist.add(teacher);
    }
    public void addAssignment(Assignment assignment){
        assignmentList.add(assignment);
    }

    public void removeStudent(Student student){
        studentList.remove(student);
    }
    public void removeStudent(Teacher teacher){
        teacherlist.remove(teacher);
    }
    public void removeAssignment(Assignment assignment){
        assignmentList.remove(assignment);
    }


}
