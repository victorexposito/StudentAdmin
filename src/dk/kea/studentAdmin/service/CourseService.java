package kea.studentAdmin.service;

import kea.studentAdmin.model.Assignment;
import kea.studentAdmin.model.Course;
import kea.studentAdmin.model.Student;
import kea.studentAdmin.model.Teacher;


import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private static CourseService mySelf = new CourseService();

    private List<Course> courses = new ArrayList<>();



    private CourseService() {
    }

    public static CourseService getCourseService() {
        return mySelf;
    }

    public boolean addCourse (Course course){
        return courses.add(course);
    }

    public boolean removeStudentFromCourse(String courseName, Student student){
        for (int i = 0; i < courses.size(); i++) {
            Course temp = courses.get(i);
            if(courseName.equals(temp.getCourseName())){
                temp.removeStudent(student);
            }
        }
        return true;
    }

    public boolean removeTeacherFromCourse(String courseName, Teacher teacher){
        for (int i = 0; i < courses.size(); i++) {
            Course temp = courses.get(i);
            if(courseName.equals(temp.getCourseName())){
                temp.removeTeacher(teacher);
            }
        }
        return true;
    }

    public boolean removeAssignmentFromCourse(String courseName, Assignment assignment){
        for (int i = 0; i < courses.size(); i++) {
            Course temp = courses.get(i);
            if(courseName.equals(temp.getCourseName())){
                temp.removeAssignment(assignment);
            }
        }
        return true;
    }


    public boolean addStudentToCourse(String courseName, Student student){
        for (int i = 0; i < courses.size() ; i++) {
            Course temp = courses.get(i);
            if (courseName.equals(temp.getCourseName())){
                temp.addStudent(student);
            }
        }
        return true;
    }

    public boolean addTeacherToCourse(String courseName, Teacher teacher){
        for (int i = 0; i < courses.size() ; i++) {
            Course temp = courses.get(i);
            if (courseName.equals(temp.getCourseName())){
                temp.addTeacher(teacher);
            }
        }
        return true;
    }

    public boolean addAssignmentToCourse(String courseName, Assignment assignment){
        for (int i = 0; i < courses.size() ; i++) {
            Course temp = courses.get(i);
            if (courseName.equals(temp.getCourseName())){
                temp.addAssignment(assignment);
            }
        }
        return true;
    }

    public List<Course> getCourseList() {
        return new ArrayList<>(courses);
    }
    public Course getBySomeIndentifier(Object identifier) {
        //TODO implement
        return null;
    }
}
