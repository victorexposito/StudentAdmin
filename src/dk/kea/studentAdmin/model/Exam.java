package dk.kea.studentAdmin.model;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Exam {

    private String dateFormat;
    private int time;
    private String course;

    public Exam(String dateFormat, int time, String course) {
        this.dateFormat = dateFormat;
        this.time = time;
        this.course = course;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
