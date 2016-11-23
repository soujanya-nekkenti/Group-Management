package groups;

import groups.GradeLevel;
import groups.Student;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student("1_student", "Sowjanya", new GradeLevel("5"));
    }

    @Test
    public void testToString() throws Exception {

        assertEquals("1_student", student.getId());
        assertEquals("Sowjanya", student.getName());
    }
}