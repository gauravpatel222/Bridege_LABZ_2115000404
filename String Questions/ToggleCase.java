import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ans="";
        for(int i=0;i<s.length();i++){
            char sh=s.charAt(i);
            if(Character.isUpperCase(sh)){
                ans+=Character.toLowerCase(sh);

            }
            else if(Character.isLowerCase(sh)){
                ans+=Character.toUpperCase(sh);
            }
        }
        System.out.println(ans);
    }
}
