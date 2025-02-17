import java.io.*;

public class LargeFileReadingEfficiency {
    public static void main(String[] args) throws IOException {
        String filePath = "largefile.txt";

        long startTime, endTime;

        startTime = System.nanoTime();
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fileReader)) {
            while (br.readLine() != null) {}
        }
        endTime = System.nanoTime();
        System.out.println("FileReader Time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        startTime = System.nanoTime();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader br = new BufferedReader(inputStreamReader)) {
            while (br.readLine() != null) {}
        }
        endTime = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
