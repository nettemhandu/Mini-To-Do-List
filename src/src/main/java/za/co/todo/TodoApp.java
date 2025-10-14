package za.co.todo;
import io.javalin.Javalin;
import org.thymeleaf.context.Context;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;


public class TodoApp {
    public static void main(String[] args) {
        // initialize Thymeleaf TemplateEngine
        TemplateEngine templateEngine = new TemplateEngine();
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        resolver.setPrefix("/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML");
        resolver.setCharacterEncoding("UTF-8");
        templateEngine.setTemplateResolver(resolver);

        // controller
        TodoController controller = new TodoController();

        // initialize Javalin
        Javalin app = Javalin.create().start(7070);

        // set up routes
//        app.get("/", controller::showTasks);
        app.get("/", ctx -> {
            Context thymeleafContext = new Context();
            thymeleafContext.setVariable("tasks", controller.tasks);
            String html = templateEngine.process("index", thymeleafContext);
            ctx.html(html);
        });
    }
}