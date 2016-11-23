package groups;

/**
 * Subject DataModel
 * @author Sowjanya
 *
 */
public class Subject {
    private String id;
    private String name;
    
    /**
     * Subject Constructor
     * @param id: Id of the Subject
     * @param name: Name of the Subject
     */
    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return (id + name);
    }	
    
    /**
     * To fetch the Id of Subject
     * @return Id of Subject
     */
    public String getId() {
        return this.id;
    }
    
    /**
     * To fetch the Name of Subject
     * @return Name of Subject
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * To set the name of the Subject
     * @param name of Subject
     */
    public void setName(String name) {
        this.name = name;
    }
}