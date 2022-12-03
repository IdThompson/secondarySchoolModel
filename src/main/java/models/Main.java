package models;

import Enums.Classes;
import Enums.Role;


public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Principal principal = Principal.getSingleInstance();
        System.out.println(principal.getName() + " is the principal");
       // System.out.println(principal.getPosition());

        Courses english = new Courses("CIVIC EDUCATION", Classes.JSS2);
        Student student2 = new Student("Wale", 13, "Adeleke street", 'A', english, Classes.JSS1);
        Applicant applicant1 = new Applicant("Dupe", 14,"Fountain Street" );
        principal.expelStudent(principal, student2);
        System.out.println(principal.admitApplicant(applicant1, principal));

        Courses civic  = new Courses("CIVIC", Classes.JSS2);

        Student student1 = new Student("Wale", 13, "Adeleke Street", 'A', civic, Classes.JSS2);

        System.out.println(student1.StudentCanTakeCourse(student1, civic));

        Staff teacher = new Staff("Mr Sam","ajah","tch001","B.SC",Role.TEACHER,Classes.JSS2);
//        Staff nonAcademic = new Staff("John", "Decagon street", "005", "HND", Role.NON_ACADEMIC_STAFF);
        System.out.println(teacher.TeacherCanTeachACourse(Classes.JSS2, civic, teacher));


    }
}
