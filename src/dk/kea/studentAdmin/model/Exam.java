package dk.kea.studentAdmin.model;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Exam {

    private String dateFormat;
    private String time;
    private String course;


    public Exam(String dateFormat, String time, String course) {
        this.dateFormat = dateFormat;
        this.time = time;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Exam  " +
                "Dato: '" + dateFormat + " " +
                "Tid: '" + time + " " +
                "Fag: '" + course + " " + "\n" +
                "___________________________________________________" +
                ' ';
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
