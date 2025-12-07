import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) throws Exception {
        if (tasks.contains(task)) {
            throw new Exception("Task with identifier " + task.getIdentifier() + " already exists in the list");
        } else {
            tasks.add(task);
        }
    }

    public boolean markTaskDone(int identifier) {
        Task foundTask;
        boolean successful = false;

        for (Task task : tasks) {
            if (task.getIdentifier() == identifier) {
                foundTask = task;
                foundTask.setDone(true);
                successful = true;
            }
        }
        return successful;
    }

    public boolean undoTask(int identifier) {
        Task foundTask;
        boolean successful = false;

        for (Task task : tasks) {
            if (task.getIdentifier() == identifier) {
                foundTask = task;
                foundTask.setDone(false);
                successful = true;
            }
        }
        return successful;
    }

    public void undoAll() {
        for (Task task : tasks) {
            task.setDone(false);
        }
    }

    public void completeAll() {
        for (Task task : tasks) {
            task.setDone(true);
        }
    }

    public void listTasks() {
        for (Task task : tasks) {
            if (task.isDone()) {
                System.out.print("[X]");
            }else System.out.print("[ ] ");

            System.out.println("Id: " + task.getIdentifier() + " - Description: " + task.getDescription());
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
