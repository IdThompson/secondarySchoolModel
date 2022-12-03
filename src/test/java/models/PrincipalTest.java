package models;

import Enums.Classes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    Principal principal;
    Applicant applicant;
    Applicant applicant2;

    Student student;
    Student student1;
    Courses mathematics;


    @BeforeEach
    void setUp() {
        principal =  Principal.getSingleInstance();
        applicant = new Applicant("Idowu", 12,  "Sangotedo");
        student = new Student("Idowu", 12, "Sangotedo", 'A',mathematics, Classes.JSS2);
        student1 = new Student("Idowu", 12, "Sangotedo", 'F',mathematics, Classes.JSS2);
        mathematics = new Courses("civic", Classes.JSS1);
        applicant2 = new Applicant("idowu", 9,  "Sangotedo");


    }

    @Test
    @DisplayName("Principal can admit applicant if applicant is between 10 and 20 years old")
    void admitGoodApplicant() {

        String expected = "Congratulations you have been admitted";
        assertEquals(expected,principal.admitApplicant(applicant,principal));
    }

    @Test
    @DisplayName("Principal cannot admit applicant if applicant is  not between 10 and 20 years old")
    void admitBadApplicant() {

        String expected = "Sorry Not Admitted";
        assertEquals(expected,principal.admitApplicant(applicant2,principal));
    }

    @Test
    @DisplayName("")
    void expelStudent() {
        String expected = "You have been expelled";
        assertEquals(expected,principal.expelStudent(principal,student1));
    }
     @Test
    void TestForCanNotExpelStudent() {
        String expected = "Not expelled";
        assertEquals(expected,principal.expelStudent(principal,student));
    }
}