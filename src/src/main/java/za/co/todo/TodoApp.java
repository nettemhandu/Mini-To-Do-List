package za.co.todo;
import io.javalin.Javalin;

public class TodoApp {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7070);
        app.get("/", ctx -> ctx.result("Hello, To-do App!"));
        app.get("/tasks", ctx -> ctx.result("List of tasks will be here"));
    }
}