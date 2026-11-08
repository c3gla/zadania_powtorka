package tasks;

import java.util.ArrayList;

public class TaskManager {

    ArrayList<Task> tasks;

    TaskManager(){
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void showTasks(){
        for(Task task : tasks){
            System.out.println(task);
        }
    }

    public void deleteTask(int index){
        tasks.remove(index - 1);
    }

    public void deleteTask(String describe){

        for (Task t : tasks){
            if(t.getDescribe().equals(describe)){
                tasks.remove(t);
                break;
            }


        }
    }
}
