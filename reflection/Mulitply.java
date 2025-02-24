

// Invoke Private Method: Define a class Calculator with a private method multiply(int a, int b). Use Reflection to invoke this method and display the result.

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Calculator{
    private void multiply(int a,int b){
        System.out.println(a*b);
    }
}

public class Mulitply {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        Calculator cal=new Calculator();
        Class c1=cal.getClass();
        Method m = c1.getDeclaredMethod("multiply", int.class, int.class);

        m.setAccessible(true);
        int result = (int) m.invoke(cal, 2, 4);

        System.out.println("Multiplication Result: " + result); // Output: 8
    }
    
}
