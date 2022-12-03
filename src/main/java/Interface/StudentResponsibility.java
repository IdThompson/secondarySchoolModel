package Interface;

import models.Courses;
import models.Student;

public interface StudentResponsibility {
    String StudentCanTakeCourse(Student student, Courses courses);

}