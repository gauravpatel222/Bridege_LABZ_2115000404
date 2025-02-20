import java.util.*;

public class FindKeyWithMaxValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(maxKey);
    }
}