public class Task {
    private String description;
    private boolean isDone;
    private int identifier;

    public Task(String description, int identifier) {
        this.description = description;
        this.identifier = identifier;
    }

    public void modifyDescription(String newDescription) throws Exception {
        if (newDescription == null || newDescription.isEmpty()) {
            throw new Exception("Invalid task description");
        } else {
            this.description = newDescription;
        }
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
}
