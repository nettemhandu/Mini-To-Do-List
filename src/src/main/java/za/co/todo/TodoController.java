package za.co.todo;

import java.util.ArrayList;
import io.javalin.http.Context;

public class TodoController {
    ArrayList<Task> tasks = new ArrayList<>();

    public void showTasks(ctx){
        ctx.json(tasks);
    }

}
