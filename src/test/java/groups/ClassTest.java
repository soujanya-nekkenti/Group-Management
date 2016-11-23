package groups;

import groups.Class;
import groups.GradeLevel;
import groups.Student;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassTest {

    private Class class1;
    private Student student1;
    private Student student2;

    @Before
    public void setUp() throws Exception {
        class1 = new Class("1_class", "1A");
        student1 = new Student("1_student", "Sowjanya", new GradeLevel("5"));
        student2 = new Student("2_student", "Lakshmmi", new GradeLevel("6"));
        class1.registerStudent(student1);
        class1.registerStudent(student2);
    }

    @Test
    public void registerStudent() throws Exception {

        assertEquals(class1.totalNumberStudents(), 2);
        assertEquals(class1.containsStudent(student1), true);
        assertEquals(class1.containsStudent(student2), true);
    }

    @Test
    public void unplaceStudent() throws Exception {
        class1.unplaceStudent(student1);
        assertEquals(class1.totalNumberStudents(), 1);
        assertEquals(class1.containsStudent(student1), false);
    }
}