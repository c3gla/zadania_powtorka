package tasks;

public class Task {

    private final int id;
    private final String description;
    private boolean statusIsDone = false;
    private static int nextId = 1;
    private Priority priority;


    public Task(String description){
        this(description, Priority.LOW);
    }

    public Task(String description, Priority priority){

        if(description == null || description.isBlank()){
            throw new IllegalArgumentException("Zadanie nie może nie mieć treści.");
        }

        this.description = description;
        id = nextId;
        this.priority = priority;
        nextId++;

    }

    public int getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public Boolean IsDone(){
        return statusIsDone;
    }

    public Priority getPriority(){
        return priority;
    }
    
    public void markAsDone(){
        statusIsDone = true;
    }

    @Override
    public String toString(){
        return "Zadanie " + id + ": " + description +
                ". Status: " + statusIsDone + ". Ważność: " + priority;
    }
}

