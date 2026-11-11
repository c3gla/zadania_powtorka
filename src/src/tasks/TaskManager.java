package tasks;

import java.util.ArrayList;

public class TaskManager {

    ArrayList<Task> tasks;

    TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void showTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void deleteTask(int index) {

        int actualIndex = index - 1;

        if (actualIndex < 0 || actualIndex >= tasks.size()) {
            throw new TaskNotFoundException("Zadanie o numerze " + index + " nie istnieje.");
        }


        tasks.remove(actualIndex);
    }

    public void deleteTask(String describe) {

        boolean removed = tasks.removeIf(t -> t.getDescribe().equals(describe));

        if (!removed) {
            throw new TaskNotFoundException("Nie znaleziono zadania o opisie: " + describe);
        }

    }
}
