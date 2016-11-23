package groups;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class HeadMasterTest {

	public HeadMaster headmaster;
    private Student student1;
    private Student student2;
	
	@Before
    public void setUp() throws Exception {
        
        headmaster = new HeadMaster("1_headmaster", "Sam");
		student1 = new Student("1_student", "Sowjanya", new GradeLevel("5"));
        student2 = new Student("2_student", "Lakshmmi", new GradeLevel("6"));
        headmaster.addStudent(student1);
        headmaster.addStudent(student2);
    }

    @Test
    public void addStudent() throws Exception {

        assertEquals(headmaster.totalNumberStudents(), 2);
    }
}
