package groups;

import groups.GradeLevel;
import groups.Subject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeLevelTest {

    private GradeLevel gradeLevel =  new GradeLevel("5");

    @Before
    public void setUp() throws Exception {
        gradeLevel.addCommonSubject(new Subject("1_subject","Math"));
        gradeLevel.addCommonSubject(new Subject("2_subject","Swedish"));
        gradeLevel.addIndividualChosenSubject(new Subject("3_subject","English"));
        gradeLevel.addIndividualChosenSubject(new Subject("4_subject","French"));
        gradeLevel.addIndividualChosenSubject(new Subject("5_subject", "Hindi"));    
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addCommonSubject() throws Exception {
        assertEquals("Math", gradeLevel.getCommonSubjects().get(0).getName());
        assertEquals("2_subject", gradeLevel.getCommonSubjects().get(1).getId());
    }

    @Test
    public void addIndividualChosenSubject() throws Exception {
        assertEquals("English", gradeLevel.getIndividualChosenSubjects().get(0).getName());
        assertEquals("French", gradeLevel.getIndividualChosenSubjects().get(1).getName());
        assertEquals("5_subject", gradeLevel.getIndividualChosenSubjects().get(2).getId());
    }
}