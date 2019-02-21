package dk.kea.studentAdmin;

import dk.kea.studentAdmin.model.Student;
import dk.kea.studentAdmin.service.StudentService;

import java.util.Scanner;

public class Console {

    /*
    The student service
     */
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
            System.out.println("1: student menu \r\n0:exit1");
            Integer choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    //Studentt menu
                    studentMenu(scanner);
                    break;
                //TODO implement all menu


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
}
