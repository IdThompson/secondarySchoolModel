package models;

import Enums.Classes;

public class Courses {
    private String courseName;
    private Classes classes;

    public Courses(String courseName, Classes classes) {
        this.courseName = courseName;
        this.classes = classes;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
