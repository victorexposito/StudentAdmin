package dk.kea.studentAdmin.model;

import java.text.SimpleDateFormat;

public class Assignment {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
    private String name;

    public Assignment(SimpleDateFormat dateFormat, String name) {
        this.dateFormat = dateFormat;
        this.name = name;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
