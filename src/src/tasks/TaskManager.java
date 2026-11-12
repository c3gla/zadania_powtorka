package tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final TaskRepository repository;

    TaskManager(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(Task task) {
        repository.add(task);
    }

    public void showTasks() {
        List<Task> tasks = repository.findAll();
        if(tasks.isEmpty()){
            System.out.println("Brak zadań.");
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void deleteTask(int id) {
        if(!repository.deleteById(id)) {
            throw new TaskNotFoundException("Zadanie o id "
            + id + " nie istnieje.");
        }
    }
}
