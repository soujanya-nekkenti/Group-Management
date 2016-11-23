package groups;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sowjanya
 * GradeLevel DataModel
 */
public class GradeLevel {
    private String id;
    private List<Subject> commonSubjects; 
    private List<Subject> individualChosenSubjects;

    /**
     * Grade Constructor 
     * @param id: The id of the Grade
     */
    public GradeLevel(String id) {
        this.id = id;
        commonSubjects = new ArrayList<Subject>();
        individualChosenSubjects = new ArrayList<Subject>();
    }

    /**
     * 
     * @param subject: Common Subject object that is to be added to the GradeLevel
     */
    public void addCommonSubject(Subject subject) {
        commonSubjects.add(subject);
    }

    /**
     * 
     * @param subject: Individual chosen Subject object that is to be added to the GradeLevel
     */
    public void addIndividualChosenSubject(Subject subject) {
        individualChosenSubjects.add(subject);
    }
    
    /**
     * To fetch the total number of Subject objects in a GradeLevel
     * @return: The number of subjects in a GradeLevel
     */
    public int getTotalNumberSubjects() {
        return commonSubjects.size() + individualChosenSubjects.size();
    }

    /**
     * 
     * @return: Fetches the List of Common subjects in a GradeLevel
     */
    public List<Subject> getCommonSubjects() {
        return commonSubjects;
    }

    /**
     * 
     * @return: Fetches the List of Individual Chosen subjects
     */
    public List<Subject> getIndividualChosenSubjects() {
        return individualChosenSubjects;
    }

    /**
     * 
     * @return: To fetch the id of the GradeLevel 
     */
    public String getId() {
        return id;
    }
}