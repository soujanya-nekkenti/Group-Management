package groups;

/**
 * Student Data Model
 * @author Sowjanya
 *
 */
public class Student{

    private String id;
    private String name;
    private GradeLevel gradeLevel;
    
    /**
     * Student Constructor
     * @param id: Id of the Student
     * @param name: Name of the Student
     * @param gradelevel: GradeLevel of the Student
     */
    public Student (String id, String name, GradeLevel gradeLevel){
        this.id = id;
        this.name = name;
        this.gradeLevel = gradeLevel;
    }
    
    /**
     * To fetch the id of the Student
     * @return id of Student
     */
	public String getId() {
		return id;
	}
	
	/**
	 * To set id for a Student
	 * @param id: Id of Student
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * To fetch the GradeLevel of the Student
	 * @return GradeLevel of Student
	 */
	public GradeLevel getGradeLevel() {
		return gradeLevel;
	}
	
	/**
	 * To set GradeLevel of a Student
	 * @param gradeLevel of Student
	 */
	public void setGradeLevel(GradeLevel gradeLevel) {
		this.gradeLevel = gradeLevel;
	}
	
	/**
	 * To fetch the Name of Student
	 * @return name of student
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * To set the Name of a Student
	 * @param name of Student
	 */
	public void setName(String name) {
		this.name = name;
	}   
}