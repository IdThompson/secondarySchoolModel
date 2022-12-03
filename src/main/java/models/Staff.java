package models;
import Enums.Classes;
import Enums.Role;
import Interface.TeacherResponsibility;

public class Staff extends Person implements TeacherResponsibility {
    private String staffID;
    private String qualification;
    public Role position;
    private String course;
    private Classes classess;


    public Staff(String name, int age, String address, String staffID, String qualification, Role position, String course, Classes classess) {
        super(name, age, address);
        this.staffID = staffID;
        this.qualification = qualification;
        this.position = position;
        this.course = course;
        this.classess = classess;
    }

    public Staff(String name, String staffID, String qualification, Role position) {
        super(name);
        this.staffID = staffID;
        this.qualification = qualification;
        this.position = position;
    }

    public Staff(){

    }

    public Staff(String name, String address, String staffID, String qualification, Role position, Classes classess) {
        super(name, address);
        this.staffID = staffID;
        this.qualification = qualification;
        this.position = position;
        this.classess = classess;


    }

    public Staff(String staffID, String qualification, Role position, String course, Classes classess) {
        this.staffID = staffID;
        this.qualification = qualification;
        this.position = position;
        this.course = course;
        this.classess = classess;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Role getPosition() {
        return position;
    }

    public void setPosition(Role position) {
        this.position = position;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Classes getClassess() {
        return classess;
    }

    public void setClassess(Classes classess) {
        this.classess = classess;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffID='" + staffID + '\'' +
                ", qualification='" + qualification + '\'' +
                ", position=" + position +
                '}';
    }

    @Override
    public String TeacherCanTeachACourse(Classes classes, Courses course, Staff teacher) {
        if (teacher.getPosition() == Role.TEACHER) {
            if (teacher.getClassess() == course.getClasses()) {
                return  (teacher.getName() + " Teacher can take course");
            } else {
                return ("unauthorized");
            }
        }else {
            return (" You are not a teacher");
        }
    }
}
