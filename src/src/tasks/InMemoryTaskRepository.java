package tasks;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class InMemoryTaskRepository implements TaskRepository {

    private Map<Integer, Task> tasks = new LinkedHashMap<>();


    @Override
    public void add(Task task) {
        tasks.put(task.getId(), task);
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(tasks.values());
    }


    @Override
    public List<Task> findAll(Predicate<Task> condition) {

        List<Task> result = new ArrayList<>();
        for (Task task : tasks.values()) {
            if (condition.test(task)) {
                result.add(task);
            }
        }
        return result;
    }

    @Override
    public boolean deleteById(int id) {

        return tasks.remove(id) != null;
    }

    @Override
    public Task findById(int id) {

        if(tasks.containsKey(id)) return tasks.get(id);
        return null;
    }

}
