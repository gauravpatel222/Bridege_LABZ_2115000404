import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class ReflectionObjectCreation {
    public static void main(String[] args) throws Exception {
        // Load the Student class dynamically
        Class<?> cls = Class.forName("Student");

        Constructor c=cls.getConstructor(String.class);
        Object sObject=c.newInstance("gaurav");
         Method displayMethod = cls.getMethod("display");
        displayMethod.invoke(sObject);
    }
}
