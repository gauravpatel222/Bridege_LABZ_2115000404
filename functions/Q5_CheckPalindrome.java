import java.util.Scanner;

public class Q5_CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
			int n=s.length()-1;
		for(int i=0;i<s.length()/2;i++){
			if(s.charAt(i)!=s.charAt(n)){
				System.out.println("not ");
                return;
  			  }
              n--;
		
            }
        System.out.print("pallindrome");
}
}
