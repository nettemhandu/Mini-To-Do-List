package za.co.todo;

import java.util.ArrayList;
import io.javalin.http.Context;

public class TodoController {
    ArrayList<Task> tasks = new ArrayList<>();

    public TodoController(){
        tasks.add(new Task(1, "Task 1", false));
        tasks.add(new Task(2, "Task 2", false));
        tasks.add(new Task(3, "Task 3", false));
    }

    public void showTasks(Context ctx){
        ctx.json(tasks);
    }
}
