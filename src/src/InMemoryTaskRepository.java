import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class InMemoryTaskRepository implements TaskRepository {

    private List<Task> tasks;

    InMemoryTaskRepository() {
        tasks = new ArrayList<>();
    }


    @Override
    public void add(Task task) {
        tasks.add(task);
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
    public void delete(int index) {
        tasks.remove(index - 1);
    }

    @Override
    public void delete(String describe) {

        for(Task task : tasks){
            if(task.getDescribe().equals(describe)){
                tasks.remove(task);
                break;
            }
        }

    }
}
