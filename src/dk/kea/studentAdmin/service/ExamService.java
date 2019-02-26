package dk.kea.studentAdmin.service;

import dk.kea.studentAdmin.model.Exam;
import dk.kea.studentAdmin.model.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExamService {
    /*
    The instance. There can be only one.
     */
    private static ExamService mySelf = new ExamService();


    private List<Exam> exams = new ArrayList<>();



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

    public boolean addStudentToExam(String examName, Student student){
        for (int i = 0; i < exams.size() ; i++) {
            Exam temp = exams.get(i);
            if (examName.equals(temp.getExamName())){
                temp.addStudent(student);
            }

        }
        return true;
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
