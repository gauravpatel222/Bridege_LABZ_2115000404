import java.lang.reflect.Method;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName = scanner.next();
        Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
        Object result = method.invoke(obj, 5, 3);
        System.out.println("Result: " + result);
    }
}