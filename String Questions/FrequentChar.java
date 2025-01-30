import java.util.HashMap;
import java.util.Scanner;

public class FrequentChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char frequent=' ';
        int min=Integer.MIN_VALUE;
        int ans=0;
       int[] map=new int[26];
       for(int i=0;i<s.length();i++){
        int ch=s.charAt(i)-97;
 
        map[ch]++;
        ans=Math.max(ans,map[ch]);
          
       }
       System.out.println(ans);
        
    }
}
