package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class InMemoryTaskRepository implements TaskRepository {

    private List<Task> tasks = new ArrayList<>();


    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }


    @Override
    public List<Task> findAll(Predicate<Task> condition) {

        List<Task> result = new ArrayList<>();
        for (Task task : tasks) {
            if (condition.test(task)) {
                result.add(task);
            }
        }
        return result;
    }

    @Override
    public boolean deleteById(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }

}
