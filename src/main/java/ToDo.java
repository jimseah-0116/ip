/**
 * ToDo class that represents a Task without any associated time.
 */
public class ToDo extends Task {
    /**
     * Constructor for ToDo class.
     *
     * @param description Description of ToDo object.
     */
    public ToDo(String description) {
        super(description);
        this.type = "T";
    }
    public ToDo(String description, boolean isDone) { // Overloaded constructor: loading from file
        super(description, isDone);
        this.type = "T";
    }
    public String toString() {
        return "[T]" + super.toString();
    }
    @Override
    public String toStorageFormat() {
        return super.toStorageFormat();
    }
}
