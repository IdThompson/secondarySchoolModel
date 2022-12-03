package Interface;

import Enums.Classes;
import models.Courses;
import models.Staff;

public interface TeacherResponsibility {
    String TeacherCanTeachACourse(Classes classes, Courses course, Staff teacher);
}
