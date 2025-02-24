package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Emails: user1@example.com, contact@domain.org, info123@gmail.com";
        
        // Email regex pattern
        String emailRegex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        
        // Compile pattern
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);
        
        // Find and print all email addresses
        System.out.println("Extracted Emails:");
        while (matcher.find()) {  // Moves to the next match
            System.out.println(matcher.group());  // Retrieves the current match
        }
    }
}
