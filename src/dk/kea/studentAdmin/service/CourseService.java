package dk.kea.studentAdmin.service;

import dk.kea.studentAdmin.model.Course;
import dk.kea.studentAdmin.model.Student;


import java.util.ArrayList;
import java.util.List;

public class CourseService {
    private static CourseService mySelf = new CourseService();

    private List<Student> dansk = new ArrayList<>();
    private List<Student> engelsk = new ArrayList<>();

    private List<Student> course = new ArrayList<>();



    private CourseService() {
    }

    public static CourseService getCourseService() {
        return mySelf;
    }


    public boolean addCourseDansk(Student student) {
        return dansk.add(student);
    }




    public boolean removeStudentDansk(Student student) {

        return dansk.remove(student);
    }


    public List<Student> getDanskList() {
        return new ArrayList<>(dansk);
    }


    public Course getBySomeIndentifier(Object identifier) {
        //TODO implement
        return null;
    }
}
