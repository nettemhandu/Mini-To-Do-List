package za.co.todo;

public class Task {
    private int id;
    private String description;
    private boolean status;

    public Task(int id, String description, boolean status) {
        this.id = id;
        this.description = description;
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
