public class Task {

    private int id;
    private String describe;
    private Boolean statusIsDone = false;
    private static int numberOfTasks = 1;


    Task(String describe){
        this.describe = describe;
        id = numberOfTasks;
        statusIsDone = false;
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

    @Override
    public String toString(){
        return "Task #" + id + ": " + describe + ". Already done: " + statusIsDone;
    }
}

