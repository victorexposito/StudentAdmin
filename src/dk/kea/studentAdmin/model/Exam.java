package dk.kea.studentAdmin.model;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Exam {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private int time;
    private String course;

    public Exam(SimpleDateFormat dateFormat, int time, String course) {
        this.dateFormat = dateFormat;
        this.time = time;
        this.course = course;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
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
