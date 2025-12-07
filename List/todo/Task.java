public class Task {
    private String description;
    private boolean isDone;
    private int identifier;

    public Task(String description, int identifier) {
        this.description = description;
        this.identifier = identifier;
    }

    public void modifyDescription(String newDescription) {
        if (newDescription == null || newDescription.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid task description");
        }
        this.description = newDescription;
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


    public void setDone(boolean done) {
        isDone = done;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }
}
