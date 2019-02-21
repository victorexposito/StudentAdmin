package dk.kea.studentAdmin.service;

import dk.kea.studentAdmin.model.Course;


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


    public boolean addCourse(Course course) {
        return courses.add(course);
    }


    public boolean removeStudent(Course course) {

        return courses.remove(course);
    }


    public List<Course> getCourseList() {
        return new ArrayList<>(courses);
    }


    public Course getBySomeIndentifier(Object identifier) {
        //TODO implement
        return null;
    }
}
