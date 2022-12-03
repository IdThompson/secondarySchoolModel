package models;

import Enums.Classes;
import Interface.StudentResponsibility;

public class Student extends Person implements StudentResponsibility {
    private boolean isExpelled = false;
    private char grade;
    private Courses courses;
    private Classes classes;


    public Student(String name, int age, String address, char grade, Courses courses, Classes classes) {
        super(name, age, address);
        this.grade = grade;
        this.courses = courses;
        this.classes = classes;
    }

    public boolean isExpelled() {
        return isExpelled;
    }

    public void setExpelled(boolean expelled) {
        isExpelled = expelled;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }



    @Override
    public String StudentCanTakeCourse(Student student, Courses courses) {
        if(student.getClasses() == courses.getClasses()){
            return  student.getName() + " You are eligible to take this course";
        }else{
            return  "You are not eligible to take this course";
        }

    }
}
