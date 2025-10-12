package za.co.todo;
import io.javalin.Javalin;

public class TodoApp {
    public static void main(String[] args) {

        Javalin app = Javalin.create().start(7070);

        TodoController controller = new TodoController();
        app.get("/", controller::showTasks);
        app.get("/tasks", controller::showTasks);
    }
}