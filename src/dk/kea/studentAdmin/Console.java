package dk.kea.studentAdmin;

import dk.kea.studentAdmin.model.Course;
import dk.kea.studentAdmin.model.Exam;
import dk.kea.studentAdmin.model.Student;
import dk.kea.studentAdmin.model.Teacher;
import dk.kea.studentAdmin.service.*;

import java.util.Scanner;

public class Console {


    private TeacherService teacherService = TeacherService.getTeacherService();
    private ExamService examService = ExamService.getExamsService();
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
                    //Studentt menu
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
        System.out.println("1. Create \r\n 2.List \r\n 0. return");
        Integer choice = scanner.nextInt();

        // TODO: make it possible to create several students in a row without coming out of the menu #lav

        switch (choice) {

            case 1:
                //create Student
                System.out.println("enter first name, last name, hold number");

                Student s = new Student(scanner.next(), scanner.next(), scanner.next());
                studentService.addStudent(s);
                break;

            case 2:
                //List student
                System.out.println("list of students");
                //TODO show the list of student - get it from studentService - loop
                for(int i = 0; i< studentService.getStudentList().size(); i++){
                    System.out.println(studentService.getStudentList().get(i));
                }

                break;
        }
    }
    private void teacherMenu(Scanner scanner) {
        System.out.println("Teacher Menu");
        System.out.println("1. Create \r\n 2.List \r\n 0. return");
        Integer choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("enter first name, last name");

                Teacher teacher = new Teacher(scanner.next(), scanner.next());
                teacherService.addTeacher(teacher);
                break;

            case 2:
                //List student
                System.out.println("list of teachers");

                break;
        }
    }
    private void examMenu(Scanner scanner) {
        System.out.println("Exam Menu");
        System.out.println("1. Create \r\n 2.List \r\n 0. return");
        Integer choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("enter date, time, course");

                Exam exam = new Exam(scanner.next(), scanner.nextInt(), scanner.next());
                examService.addExams(exam);
                break;

            case 2:
                //List student
                System.out.println("list exams");

                break;
        }
    }
    private void courseMenu(Scanner scanner) {
        System.out.println("Course Menu");
        System.out.println("1. Create \r\n 2.List \r\n 0. return");
        Integer choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("enter name");

                Course course = new Course(scanner.next());
                CourseService.addCourse(course);
                break;

            case 2:
                //List student
                System.out.println("list courses");

                break;
        }
    }
}
