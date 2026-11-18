package tasks;

import java.util.ArrayList;
import java.util.Comparator;
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

    public void markAsDone(int id) {
        Task searchingTask = repository.findById(id);

        if(searchingTask == null) throw new TaskNotFoundException("Task don't exist.");

        searchingTask.markAsDone();

    }

    public void showTasksSortedByPriority() {
        List<Task> tasks = repository.findAll();
        tasks.sort(Comparator.comparing(Task::getPriority).reversed().thenComparing(Task::getId));

        for(Task task : tasks) System.out.println(task);
    }

    public void showTasksByPriority(Priority priority) {
        List<Task> tasks = repository.findAll(task -> task.getPriority() == priority);
        if(tasks == null) System.out.println("Brak zadań o tym priorytecie.");
        System.out.println(tasks);
    }
}
