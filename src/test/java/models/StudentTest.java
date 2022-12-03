package models;

import Enums.Classes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    @DisplayName("When student is eligible to take a course")
    void TestForGoodStudentCanTakeCourse() {
        Courses civic = new Courses("Civic", Classes.JSS1);
        Student student = new Student("Wale", 15, "Adeleke Street", 'A', civic, Classes.JSS1);

        String expected ="You are eligible to take this course";
        assertEquals(expected, student.StudentCanTakeCourse(student,civic));
    }

    @Test
    @DisplayName("When student is not eligible to take a course")
    void TestForStudentCannotTakeCourse() {
        Courses civic = new Courses("Civic", Classes.JSS2);
        Student student = new Student("Wale", 13, "Adeleke Street", 'A', civic, Classes.JSS1);

        String expected ="You are not eligible to take this course";
        assertEquals(expected, student.StudentCanTakeCourse(student,civic));
    }
}

