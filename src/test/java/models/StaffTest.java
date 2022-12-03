package models;

import Enums.Classes;
import Enums.Role;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    Staff teacher = new Staff("Ebenezer","Bsc Science", Role.TEACHER,"civic",Classes.JSS2);
    Staff teacher2 = new Staff("Ebenezer","Bsc Science", Role.NON_ACADEMIC_STAFF,"civic",Classes.JSS2);
    Courses civic  = new Courses("CIVIC", Classes.JSS2);
    @Test
    @DisplayName("Teacher can take a course when position is equal to teacher role")
    void teacherCanTakeACourse() {
        String expected = "Teacher can take course";
        assertEquals(expected, teacher.TeacherCanTeachACourse(Classes.JSS2, civic, teacher));
    }
    @Test
    @DisplayName("Teacher can take a course when position is equal to teacher role")
    void CannotTakeACourse() {
        String expected = " You are not a teacher";
        assertEquals(expected, teacher.TeacherCanTeachACourse(Classes.JSS2, civic, teacher2));
    }

}
