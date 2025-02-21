// 📌 Problem Statement:
// Create a program that reads a text file and writes its contents into another file, converting all uppercase letters to lowercase.
// using streams
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lower_to_upper {
    public static void main(String[] args) throws IOException {
        try {
            FileReader f=new FileReader("C:\\Users\\Gaurav\\Desktop\\classroom\\abc.text");
            int  c;
            ArrayList<Character> list=new ArrayList<>();
            while((c=f.read())!=-1){
                    // System.out.println((char)c+" ");
                    list.add((char)c);
                
            }
            f.close();
            ArrayList<Character> convert=(ArrayList<Character>) list.stream().map(ch->Character.isUpperCase(ch)?Character.toLowerCase(ch):Character.toUpperCase(ch))
            .collect(Collectors.toList());
            FileWriter fw = new FileWriter("C:\\Users\\Gaurav\\Desktop\\classroom\\target.txt");
            for (int i = 0; i < convert.size(); i++) {
                fw.write(convert.get(i));
                System.out.println(convert.get(i));
            }
            fw.close();


        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
    }
}
