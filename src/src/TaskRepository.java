import java.util.List;
import java.util.function.Predicate;

public interface TaskRepository {

    public abstract void add(Task task);
    public abstract List<Task> findAll(Predicate<Task> condition);
    public abstract void delete(int index);
    public abstract void delete(String describe);


}
