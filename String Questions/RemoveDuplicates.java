import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine(); 

        String d = "";  

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            
            if (s.indexOf(a) == i) {
                d += a;  
            }
        }

        System.out.println("String after removing duplicates: " + d);
    }
}
