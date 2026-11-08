package tasks;

public class Task {

    private int id;
    private String describe;
    private Boolean statusIsDone = false;
    private static int numberOfTasks = 1;
    private Priority priority = Priority.LOW;


    Task(String describe){
        this.describe = describe;
        id = numberOfTasks;
        statusIsDone = false;
        priority = Priority.LOW;
        numberOfTasks++;
    }

    Task(String describe, Priority priority){
        this.describe = describe;
        id = numberOfTasks;
        statusIsDone = false;
        this.priority = priority;
        numberOfTasks++;

    }

    public int getId(){
        return id;
    }

    public String getDescribe(){
        return describe;
    }

    public Boolean getStatusIsDone(){
        return statusIsDone;
    }

    public Priority getPriority(){
        return priority;
    }

    @Override
    public String toString(){
        return "tasks.Task #" + id + ": " + describe +
                ". Already done: " + statusIsDone + ". tasks.Priority: " + priority;
    }
}

