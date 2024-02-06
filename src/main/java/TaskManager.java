import java.util.ArrayList;

public class TaskManager {
    private static ArrayList<Task> taskList;
    private static int taskCount = 0;

    public TaskManager() {
        taskList = new ArrayList<>(101);
        taskList.add(null); // First element left empty for 1-based indexing
    }
    public static void deleteTask(int index) { // Index is guaranteed to contain a valid task
        if (index < 1 || index > 100) {
            Ui.printMessage("You can only delete tasks within the range of 1 to 100.");
            return;
        }
        Task task = taskList.get(index);
        taskList.remove(index);
        decrementTaskCount();
    }
    public static void addTask(Task task) {
        for (int i = 1; i <= 100; i++) {
            if (taskList.get(i) == null) {
                taskList.add(i, task);
                incrementTaskCount();
                return;
            }
        }
        Ui.printMessage("Sorry bro, you can only have up to 100 tasks in your list.");
    }
    public static Task getTask(int index) {
        return taskList.get(index);
    }
    public static ArrayList<Task> getList() {
        return taskList;
    }
    /**
     * Increases the task count by 1.
     */
    public static void incrementTaskCount() {
        taskCount++;
    }

    /**
     * Decreases the task count by 1.
     */
    public static void decrementTaskCount() {
        taskCount--;
    }

    /**
     * Returns the task count.
     * @return Task count.
     */
    public static int getTaskCount() {
        return taskCount;
    }
}
