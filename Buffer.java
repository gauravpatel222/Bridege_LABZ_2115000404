// 📌 Problem Statement:
// Develop a Java program that efficiently reads a large text file (500MB+) line by line and prints only lines containing the word "error".
// Requirements:
// Use BufferedReader for efficient reading.
// Read line-by-line instead of loading the entire file.
// Display only lines containing "error" (case insensitive).

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;;

public class Buffer {
    public static void main(String[] args) {
        try{
            BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Gaurav\\Desktop\\classroom\\abc.text"));
            BufferedWriter sf=new BufferedWriter(new FileWriter("C:\\Users\\Gaurav\\Desktop\\classroom\\target.txt"));
                String s="";
                while((s=bf.readLine())!=null){
                        String[] a=s.split(" ");
                        for(int i=0;i<a.length;i++){
                                if(a[i].equals("error")){
                                        sf.write(s);
                                        sf.newLine();
                                        System.out.println(s);

                                }
                        }


                }
                bf.close();
                sf.close();
        }
        catch(IOException e){
                System.out.println(e);
        }
    }
}
