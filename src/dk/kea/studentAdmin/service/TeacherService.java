package dk.kea.studentAdmin.service;

import dk.kea.studentAdmin.model.Student;
import dk.kea.studentAdmin.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {

    /*
    The instance. There can be only one.
     */
    private static TeacherService mySelf = new TeacherService();

    /*
    The list of student
     */
    private List<Teacher> teachers = new ArrayList<>();

    /*
    private constructor to avoid creation from outside the class
     */

    private TeacherService() {
    }

    /*
    Return the one and only instance
     */
    public static TeacherService getTeacherService() {
        return mySelf;
    }

    /**
     * add a student
     * @param //student
     * @return
     */
    public boolean addTeacher(Teacher teacher) {
        return teachers.add(teacher);
    }

    /**
     * remove s from student list - list methods for finding an object relies on equals method !!!
     * @param //s
     * @return
     */
    public boolean removeTeacher(Teacher t) {

        return teachers.remove(t);
    }

    /**
     *
     * @return the student list. Only for viewing
     */
    public List<Teacher> getTeacherList() {
        return new ArrayList<>(teachers);
    }

    /**
     *
     * Return a specific student based on the indentifier( to be determined)
     * @param identifier (rename)
     * @return
     */
    public Teacher getBySomeIndentifier(Object identifier) {
        //TODO implement
        return null;
    }
}
