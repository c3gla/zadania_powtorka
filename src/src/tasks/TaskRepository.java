package tasks;

import java.util.List;
import java.util.function.Predicate;

public interface TaskRepository {

    void add(Task task);
    List<Task> findAll();
    List<Task> findAll(Predicate<Task> condition);
    boolean deleteById(int id);



}
