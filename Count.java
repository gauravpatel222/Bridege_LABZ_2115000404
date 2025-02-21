// 10. Count Words in a File
// 📌 Problem Statement:
// Write a Java program that counts the number of words in a given text file and displays the top 5 most frequently occurring words.
// Requirements:
// Use FileReader and BufferedReader to read the file.
// Use a HashMap<String, Integer> to count word occurrences.
// Sort the words based on frequency and display the top 5.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Count {
    public static void main(String[] args) {
        try( BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Gaurav\\Desktop\\classroom\\abc.text")))
        {
            // FileReader fr=new FileReader("C:\Users\Gaurav\Desktop\classroom\abc.text");
            String s="";
            HashMap<String,Integer> map=new HashMap<>();
            while((s=bf.readLine())!=null){
                String[] a=s.split(" ");
                for(int i=0;i<a.length;i++){
                        map.put(a[i], map.getOrDefault(a[i], 0)+1);
                    }
                
            }
            System.out.println(map);
ArrayList<String> list = (ArrayList<String>) map.keySet()
    .stream()
    .sorted(Comparator.comparingInt(map::get).reversed()) 
    .limit(5)
    
    // Move .reversed() inside sorted()
    .collect(Collectors.toList()); // Collect as ArrayList
            System.out.println(list);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
