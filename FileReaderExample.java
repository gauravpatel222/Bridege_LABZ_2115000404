import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        String filePath = "java.txt"; 
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        
        reader.close();
    }
}
