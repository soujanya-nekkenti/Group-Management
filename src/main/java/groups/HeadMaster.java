package groups;

import java.util.ArrayList;
import java.util.List;

/**
 * HeadMaster DataModel
 * @author Sowjanya
 *
 */
public class HeadMaster {

	private String id;
	private String name;
	private List<Student> students;

	/**
	 * Constructor
	 * @param id: Id of the HeadMaster
	 * @param name: Name of the HeadMAster
	 */
	public HeadMaster(String id, String name){
		this.id = id;
        this.name = name;
        students = new ArrayList<Student>();
	}
	
	/**
	 * This method fetches the Id of the HeadMaster
	 * @return: returns the Id of the HeadMaster
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the Id of the HeadMaster
	 * @param id: Id of the HeadMaster
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * This method fetches the Name of the HeadMaster
	 * @return: returns the Name of the HeadMaster
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the Name of the HeadMaster
	 * @param name: Name of the HeadMaster
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This method allows the HeadMaster to take further action i.e. adding an unplced student.
	 * @param student: Student to be added.
	 */
	public void addStudent(Student student){
		students.add(student);
	}
	
	/**
     * 
     * @return: The number of Students in the Class
     */
    public int totalNumberStudents() {
        return students.size();
    }
}

