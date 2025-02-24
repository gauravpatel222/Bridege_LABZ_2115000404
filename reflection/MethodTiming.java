import java.lang.reflect.Method;

class Task {
    public void execute() {
        for (int i = 0; i < 1000000; i++);
    }
}

public class MethodTiming {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        Method method = Task.class.getMethod("execute");

        long start = System.nanoTime();
        method.invoke(task);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start) + " ns");
    }
}