package groups;

import java.util.ArrayList;
import java.util.List;

/**
 * Class DataModel
 * @author Sowjanya 
 */
public class Class {
    private String id;
    private String name;
    private List<Student> studentList; 

    /**
     * Constructor for the Class DataModel
     * @param id: The id of the Class
     * @param name: The name of the Class 
     */
    public Class(String id, String name) {
        this.id = id;
        this.name = name;
        studentList = new ArrayList<Student>();
    }

    /**
     * To fetch the id of the Class
     * @return: The id of the Class
     */
    public String getId() {
        return id;
    }

    /**
     * To fetch the name of the Class
     * @return: The name of the Class
     */
    public String getName() {
        return name;
    }

    /**
     * To set the name of the Class
     * @param name: name of the Class
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * To fetch the student list in a Class
     * @return: The studentList in the Class
     */
    public List<Student> getStudents() {
        return studentList;
    }
    
    /**
     * To register a Student in a particular Class
     * @param student: Student object that is to be added to the Class
     */
    public void registerStudent(Student student) {
        studentList.add(student);
    }

    /**
     * Unplace a Student 
     * @param student: The student who has to be unplaced
     * @return: true if unplaced successfully and false if not 
     */
    public boolean unplaceStudent(Student student) {
        for (Student s : studentList) {
            if (s.equals(student)) {
                studentList.remove(student);
                	informHeadMaster(student);
                return true;
            }
        }
        return false;
    }

    /**
     * To check if a Student exists in a particular Class
     * @param student: The student object which has to be checked
     * @return: true if Student found, false if not.
     */
    public boolean containsStudent(Student student) {
        return studentList.contains(student);
    }

    /**
     * 
     * @return: The number of Students in the Class
     */
    public int totalNumberStudents() {
        return studentList.size();
    }
    
    /**
     * Informs the Headmaster that a student has been unplaced
     */
    public void informHeadMaster(Student student){
      	System.out.println(student.getName() + " with id: " + student.getId() +" has been unplaced and this is a notification");
    }
}
