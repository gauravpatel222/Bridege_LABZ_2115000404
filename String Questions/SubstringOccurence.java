import java.util.Scanner;

public class SubstringOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String subString = sc.next();

        int c=0;
        for(int i=0;i<=s.length()-subString.length();i++){
            if(s.substring(i,i+subString.length()).equals(subString)){
                c++;
            }
          System.out.println(  s.substring(i,i+subString.length()));
           
        }
        System.out.println(c);;
    }
}
