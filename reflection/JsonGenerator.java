import java.lang.reflect.Field;

class User {
    public String username = "admin";
    public int age = 25;
}

public class JsonGenerator {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            json.append('"').append(field.getName()).append("":"").append(field.get(obj)).append("",");
        }
        return json.deleteCharAt(json.length() - 1).append("}").toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User();
        System.out.println(toJson(user));
    }
}