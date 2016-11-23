package groups;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import groups.Subject;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SubjectTest {

    private List<Subject> subjectList;

    @Before
    public void setUp() throws Exception {
        subjectList = new ArrayList<Subject>();
        subjectList.add(new Subject("1_subject","Math"));
        subjectList.add(new Subject("2_subject","Swedish"));
        subjectList.add(new Subject("3_subject","English"));
        subjectList.add(new Subject("4_subject","French"));
    }

    @After
    public void tearDown() throws Exception {
        subjectList.clear();
    }

    @Test
    public void testToString() throws Exception {
        for (Subject subject : subjectList) {
            assertEquals(subject.toString(), subject.getId() + subject.getName());
        }
    }
}