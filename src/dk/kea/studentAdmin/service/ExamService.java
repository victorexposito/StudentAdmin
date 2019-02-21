package dk.kea.studentAdmin.service;

import dk.kea.studentAdmin.model.Exam;
import dk.kea.studentAdmin.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ExamService {
    /*
    The instance. There can be only one.
     */
    private static ExamService mySelf = new ExamService();

    /*
    The list of student
     */
    private List<Exam> exams = new ArrayList<>();

    /*
    private constructor to avoid creation from outside the class
     */

    private ExamService() {
    }

    /*
    Return the one and only instance
     */
    public static ExamService getExamService() {
        return mySelf;
    }

    /**
     * add a student
     * @param// student
     * @return
     */
    public boolean addExams(Exam exam) {
        return exams.add(exam);
    }

    /**
     * remove s from student list - list methods for finding an object relies on equals method !!!
     * @param// t
     * @return
     */
    public boolean removeExam(Exam e) {

        return exams.remove(e);
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
