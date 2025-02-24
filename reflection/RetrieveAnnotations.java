import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AnnotatedElement;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name="John Doe")
class SampleClass {}

public class RetrieveAnnotations {
    public static void main(String[] args) {
        Class<SampleClass> obj = SampleClass.class;
        Author annotation = obj.getAnnotation(Author.class);
        if (annotation != null) {
            System.out.println("Author: " + annotation.name());
        }
    }
}