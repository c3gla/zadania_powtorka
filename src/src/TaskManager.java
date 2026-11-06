import java.util.ArrayList;

public class TaskManager {

    ArrayList<String> tasks;

    TaskManager(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task){
        tasks.add(task);
    }
}
