package dk.kea.studentAdmin.service;

import dk.kea.studentAdmin.model.Student;
import dk.kea.studentAdmin.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {


    private static TeacherService mySelf = new TeacherService();


    private List<Teacher> teachers = new ArrayList<>();

    private TeacherService() {
    }


    public static TeacherService getTeacherService() {
        return mySelf;
    }


    public boolean addTeacher(Teacher teacher) {
        return teachers.add(teacher);
    }


    public boolean removeTeacher(Teacher t) {

        return teachers.remove(t);
    }


    public List<Teacher> getTeacherList() {
        return new ArrayList<>(teachers);
    }


    public Teacher getBySomeIndentifier(Object identifier) {
        //TODO implement
        return null;
    }
}
