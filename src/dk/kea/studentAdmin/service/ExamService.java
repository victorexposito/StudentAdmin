package dk.kea.studentAdmin.service;

import dk.kea.studentAdmin.model.Exam;
import dk.kea.studentAdmin.model.Student;

import java.util.*;

public class ExamService {
    /*
    The instance. There can be only one.
     */
    private static ExamService mySelf = new ExamService();


    private List<Exam> exams = new ArrayList<>();
    private Student student;


    private ExamService() {
    }



    public static ExamService getExamService() {
        return mySelf;
    }


    public boolean addExams(Exam exam) {
        return exams.add(exam);
    }

    public boolean removeExam(Exam e) {

        return exams.remove(e);
    }

    public void addStudentToExam(String examName, Student student){
        for (int i = 0; i < exams.size() ; i++) {
            Exam temp = exams.get(i);
            if (examName.equals(temp.getExamName())){
                temp.addStudent(student);
            }

        }

    }
    public boolean removeStudentToExam(String examName, Student student){
        for (int i = 0; i < exams.size() ; i++) {
            Exam temp = exams.get(i);
            if (examName.equals(temp.getExamName())){
                temp.removeStudent(student);
            }

        }
        return true;
    }

    public void examOrder(Exam exam){
        Collections.reverse(exams);
        System.out.println(exams);
    }


    /**
     *
     * @return the student list. Only for viewing
     */
    public List<Exam> getExamList() {
        return new ArrayList<>(exams);
    }

    public void printAllMember(Exam examName) {
        for (int i = 0; i < exams.size(); i++) {
            Exam temp = exams.get(i);
            if (examName.equals(temp.getExamName())) {
                System.out.println(temp.toString());
            }


        }
    }
    /**
     *
     * Return a specific student based on the indentifier( to be determined)
     * @param identifier (rename)
     * @return
     */
    public Exam getBySomeIndentifier(Object identifier) {
        //TODO implement
        return null;
    }


}
