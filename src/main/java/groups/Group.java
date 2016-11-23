package groups;

import java.util.ArrayList;
import java.util.List;

/**
 * Group DataModel
 * @author Sowjanya
 *
 */
public class Group {
    private String id;
    private String name;
    private List<Subject> subjectsList; 
    private List<Student> studentsList; 
    private int min_students; 
    private int max_students;

    /**
     * Group Constructor
     * @param id: Id of the Group
     * @param name: Name of the Group
     * @param min_students: Minimum number of Students in a Group
     * @param max_students: Maximum number of Students in a Group
     */
    public Group(String id, String name, int min_students, int max_students) {
        this.id = id;
        this.name = name;
        this.min_students = min_students;
        this.max_students = max_students;
        this.subjectsList = new ArrayList<Subject>();
        this.studentsList = new ArrayList<Student>();
    }

    /**
     * Adding a subject to a Group
     * @param subject: Subject object that is being added to the Group
     */
    public void addSubject(Subject subject) {
        subjectsList.add(subject);
    }

    /**
     * This method removes a Subject from a Group
     * @param subject: subject object that is to be removed from the Group
     * @return: true if success, false if failed
     */
    public boolean removeSubject(Subject subject) {
        return subjectsList.remove(subject);
    }

    /**
     * To fetch the subject list in Group
     * @return: The list of Subjects in the Group
     */
    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    /**
     * This method is to add a Student object to a Group
     * @param student: Student object that is to be added to the Group
     * @return: true if success, false if failed
     */
    public boolean addStudent(Student student) {
        if (studentsList.size() < max_students) {
            studentsList.add(student);
            return true;
        }
        // If the max number of students is exceeded, return false. To be unplaced. 
        return false;
    }

    /**
     * Unplace or Remove a Student from the Group 
     * @param student: the student which has to be unplaced
     * @return: true if success, false if failed
     */
    public boolean unplaceStudent(Student student) {
        informHeadMaster(student);
    	return studentsList.remove(student);
    }

    /**
     * Calculate the total number of students
     * @return: list of students
     */
    public int totalNumberOfStudents() {
        return studentsList.size();
    }
    /**
     * Calculate the total number of subjects
     * @return: list of subjects
     */
    public int totalNumberOfSubjects() {
        return subjectsList.size();
    }
    /**
     * Checks if the student is present in list
     * @param student: the student in the list
     * @return: true if present, false if not
     */
    public boolean checksStudent(Student student) {
        return studentsList.contains(student);
    }
    /**
     * Checks the subject list
     * @param subject: subject in the list
     * @return: true if present, false if not
     */
    public boolean checksSubject(Subject subject) {
        return subjectsList.contains(subject);
    }
    
    /**
     * Unplaces all the students if the minimum threshold of the students is not reached
     * @return: unplaced students
     */
    public List<Student> unplaceStudents() {
        List<Student> unplaced = null;
        if (studentsList.size() < min_students) {
            unplaced = new ArrayList<Student>(studentsList);
            studentsList.clear();
        }
        for(int i=0; i< unplaced.size(); i++)
        	informHeadMaster(unplaced.get(i));
        return unplaced;
    }

    /**
     * 
     * @return: Fetches the list of students Registered
     */
    public List<Student> getRegisteredStudents() {
        return studentsList;
    }
    
    /**
     * 
     * @return Fetches the id of Group
     */
    public String getId() {
        return id;
    }
    
    /**
     * 
     * @return Fetches the name of the Group
     */
    public String getName() {
        return name;
    }
    
    /**
     * To set the name of the Group
     * @param name of the Group
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return Fetches the minimum number of students in a Group
     */
    public int getMinStudents()  {
        return min_students;
    }
    
    /**
     * To set the minimum number of students to a Group
     * @param min_students for a Group
     */

    public void setMinStudents(int min_students) {
        this.min_students = min_students;
    }
    
    /**
     * 
     * @return Fetches the maximum number of students in a Group
     */
    public int getMaxStudents() {
        return max_students;
    }
    
    /**
     * To set the maximum number of students in a Group
     * @param max_students for a Group
     */
    public void setMaxStudents(int max_students) {
        this.max_students = max_students;
    }    
    
    /**
     * Informs the Headmaster that a student has been unplaced
     */
    public void informHeadMaster(Student student){
    	System.out.println( student.getName() + " with id: " + student.getId() + " has been unplaced and this is a notification");
    }
}
