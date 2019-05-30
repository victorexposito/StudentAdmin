package kea.studentAdmin.service;

import kea.studentAdmin.model.Student;
import kea.studentAdmin.model.Teacher;

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


    public Teacher getTeacher(String name)     //finds player information via ID
    {
        for(Teacher t : teachers)
        {
            if(name.equals(t.getFirstName())) return t;

        }

        return null;
    }

    public void removeTeacher(String name)   //removes specific player from arraylist tpList
    {
        Teacher t = getTeacher(name);
        teachers.remove(t);
    }


    public List<Teacher> getTeacherList() {
        return new ArrayList<>(teachers);
    }


    public Teacher getBySomeIndentifier(Object identifier) {
        //TODO implement
        return null;
    }
    public void printTeachers()  //prints tpList
    {
        for(Teacher t : teachers)
        {
            System.out.printf("%-5s%-5s%n", t.getFirstName(),t.getLastName());

        }
    }
}
