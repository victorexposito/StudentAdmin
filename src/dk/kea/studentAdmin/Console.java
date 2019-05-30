package kea.studentAdmin;

import kea.studentAdmin.model.Course;
import kea.studentAdmin.model.Exam;
import kea.studentAdmin.model.Student;
import kea.studentAdmin.model.Teacher;
import kea.studentAdmin.service.*;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {


    private TeacherService teacherService = TeacherService.getTeacherService();
    private ExamService examService = ExamService.getExamService();
    private CourseService courseService = CourseService.getCourseService();
    private AssignmentService assignmentService = AssignmentService.getAssignmentService();
    private StudentService studentService = StudentService.getStudentService();

    /*
    constructor
     */
    public Console() {
    }

    /*
    Make an instance and run - always easier with an instance, so we don't need everything to be static
     */
    public static void main(String[] args) {

        new Console().run();
    }


    private void run() {
        /*
        Make a menu
         */

        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        // run until exit code is entered
        while (true) {
            System.out.println("1: student menu \r\n 2: teacher menu\n" +
                    " 3: exam menu \n" +
                    " 4: course menu\r\n 0:exit1");

                Integer choice = scanner.nextInt();


            switch (choice) {

                case 1:
                    //Student menu
                    studentMenu(scanner);
                    break;
                    //TODO implement all menu
                case 2:
                    teacherMenu(scanner);
                    break;
                case 3:
                    examMenu(scanner);
                    break;
                case 4:
                    courseMenu(scanner);
                    break;
                case 0:
                    run = false;
                    break;

            }
        }

    }


    private void studentMenu(Scanner scanner) {
        System.out.println("Student Menu");
        System.out.println("1. Create \r\n 2.List\n" +
                " 2.Remove\r\n 0. return");
        Integer choice = scanner.nextInt();

        // TODO: make it possible to create several students in a row without coming out of the menu #lav

        switch (choice ) {

            case 1:
                //create Student
                System.out.println("enter first name, last name");

                Student s = new Student(scanner.next(), scanner.next());
                studentService.addStudent(s);
                studentMenu(scanner);
                break;

            case 2:
                //List student
                System.out.println("list of students");
                //studentService.printList();
                studentService.printStudents();
                studentMenu(scanner);

                break;
            case 3:
                //remove student
                System.out.println("Remove student");
                String name = scanner.next();
                studentService.removeStudent(name);
                studentMenu(scanner);

                break;
        }
    }
    private void teacherMenu(Scanner scanner) {
        System.out.println("Teacher Menu");
        System.out.println("1. Create \r\n 2.List \n" +
                " 3.Remove\r\n 0. return");
        Integer choice = scanner.nextInt();

        switch (choice) {

            case 1:
                //Create Teacher
                System.out.println("enter first name, last name");

                Teacher t = new Teacher(scanner.next(), scanner.next());
                teacherService.addTeacher(t);
                studentMenu(scanner);
                break;

            case 2:
                //List student
                System.out.println("list of teachers");
                teacherService.printTeachers();
                teacherMenu(scanner);

                break;
            case 3:
                //remove student
                System.out.println("Remove student");
                String name = scanner.next();
                studentService.removeStudent(name);
                studentMenu(scanner);

                break;
        }
    }
    private void examMenu(Scanner scanner) {
        System.out.println("Exam Menu");
        System.out.println("1. Create Exam\r\n 2.Lists of exams\n" +
                " 3.Add Student \n" +
                " 4.Remove Student\n" +
                " 5. Remove exam\n" +
                " 6.Exam order \r\n 0. return");
        Integer choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("enter date, time, course");

                System.out.println("Name");
                String name = scanner.next();

                System.out.println("Date");
                String date = scanner.next();

                System.out.println("Time");
                String time = scanner.next();

                System.out.println("Location");
                String location = scanner.next();

                Exam exam = new Exam(name,date,time,location);
                examService.addExams(exam);
                examMenu(scanner);
                break;

            case 2:

                System.out.println(Arrays.toString(examService.getExamList().toArray()));

                break;
            case 3:
                System.out.println("Exam name, firstname, lastname");

                String tempAdd = scanner.next();
                Student student = new Student(scanner.next(),scanner.next());
                examService.addStudentToExam(tempAdd, student);

                examMenu(scanner);

                break;
            case 4:
                System.out.println("Exam name, firstname, lastname");

                String exam1 = scanner.next();
                student = new Student(scanner.next(), scanner.next());
                examService.removeStudentToExam(exam1, student);

                examMenu(scanner);

                break;

            case 5:

                System.out.println("Remove exam");
                String examName = scanner.next();
                examService.removeExam(examName);
                examMenu(scanner);

                break;

            case 6:

                System.out.println("Exam Order:");
                examService.examOrder();
                examMenu(scanner);

                break;
        }
    }
    private void courseMenu(Scanner scanner) {
        System.out.println("Course Menu");
        System.out.println("1. Create \r\n 2.List \n" +
                " 3.Add Student\r\n 4. Remove Student\n" +
                " 0. return");
        Integer choice = scanner.nextInt();

        switch (choice) {

            case 1:

                System.out.println("Name of Course:");
                String name = scanner.next();

                Course course = new Course(name);
                courseService.addCourse(course);
                courseMenu(scanner);

                break;

            case 2:
                System.out.println(Arrays.toString(courseService.getCourseList().toArray()));
                courseMenu(scanner);
                break;

            case 3:
                System.out.println("Course name, firstname, lastname");

                String tempAdd = scanner.next();
                Student student = new Student(scanner.next(),scanner.next());
                courseService.addStudentToCourse(tempAdd, student);
                courseMenu(scanner);

                break;

            case 4:
                System.out.println("Course name, firstname, lastname");

                String course1 = scanner.next();
                student = new Student(scanner.next(), scanner.next());
                courseService.removeStudentFromCourse(course1, student);

                courseMenu(scanner);

                break;
            case 5:
                System.out.println("Course name, firstname, lastname");

                String tempAddT = scanner.next();
                Teacher teacher = new Teacher(scanner.next(),scanner.next());
                courseService.addTeacherToCourse(tempAddT, teacher);
                courseMenu(scanner);

                break;

            case 6:
                System.out.println("Course name, firstname, lastname");

                String course2 = scanner.next();
                teacher = new Teacher(scanner.next(), scanner.next());
                courseService.removeTeacherFromCourse(course2, teacher);

                courseMenu(scanner);

                break;
        }
    }
}
