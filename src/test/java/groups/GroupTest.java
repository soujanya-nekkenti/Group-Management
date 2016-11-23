package groups;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import groups.GradeLevel;
import groups.Group;
import groups.Student;
import groups.Subject;

import java.util.List;

import static org.junit.Assert.*;

public class GroupTest {

    Group group1;
    Subject subject1, subject2, subject3, subject4, subject5;
    Student student1, student2, student3, student4, student5, student6, student7;

    @Before
    public void setUp() throws Exception {
    	
        group1 = new Group("1_group", "group1", 2, 6);
        subject1 = new Subject("1_subject", "Math");
        subject2 = new Subject("2_subject", "Swedish");
        subject3 = new Subject("3_subject", "English");
        subject4 = new Subject("4_subject", "French");
        subject5 = new Subject("5_subject", "Hindi");

        student1 = new Student("1_student", "Sowjanya", new GradeLevel("5"));
        student2 = new Student("2_student", "Lakshmi", new GradeLevel("6"));
        student3 = new Student("3_student", "Kavya", new GradeLevel("7"));
        student4 = new Student("4_student", "Raim", new GradeLevel("8"));
        student5 = new Student("5_student", "Sudha", new GradeLevel("9"));
        student6 = new Student("6_student", "Deepika", new GradeLevel("10"));
        student7 = new Student("7_student", "Priyanka", new GradeLevel("11"));

        group1.addSubject(subject1);
        group1.addSubject(subject2);
        group1.addSubject(subject3);
        group1.addSubject(subject4);
        group1.addSubject(subject5);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);
        group1.addStudent(student6);
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void addSubject() throws Exception {
    	
        assertEquals(group1.totalNumberOfSubjects(), 5);
    }

    @Test
    public void removeSubject() throws Exception {
    	
        group1.removeSubject(subject1);
        assertFalse(group1.checksSubject(subject1));
        assertEquals(group1.totalNumberOfSubjects(), 4);
    }

    @Test
    public void addStudent() throws Exception {

        assertFalse(group1.addStudent(student7));
        assertEquals(group1.totalNumberOfStudents(), 6);
    }

    @Test
    public void removeStudent() throws Exception {
    	
        group1.unplaceStudent(student5);
        System.out.print("The above one is from RemoveStudent TestCase"); //For convenient logging
        assertFalse(group1.checksStudent(student5));
        assertEquals(group1.totalNumberOfStudents(), 5);
    }

    @Test
    public void unplaceStudents() throws Exception {
        group1.unplaceStudent(student1);
        group1.unplaceStudent(student2);
        group1.unplaceStudent(student3);
        group1.unplaceStudent(student4);
        group1.unplaceStudent(student5);
        assertEquals(group1.totalNumberOfStudents(), 1);
        List<Student> unplaced = group1.unplaceStudents();
        assertEquals(unplaced.size(), 1);
        assertEquals(unplaced.get(0).getId(), "6_student");
        assertEquals(group1.totalNumberOfStudents(), 0);
    }
}
