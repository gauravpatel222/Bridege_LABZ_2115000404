// Access Private Field: Create a class Person with a private field age. Use Reflection to modify and retrieve its value.

import java.lang.reflect.Field;

class Person{
    private String name="fdsf";
}
public class Access {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Person p=new Person();
        Class c1=p.getClass();
        Class c2=Person.class;
        Class c3=Class.forName("Person");
        // Method[] method=c1.getDeclaredMethod(null, null);
        Field field=c1.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(p));
        field.set(p,"32");
        
        
    }
    
}
