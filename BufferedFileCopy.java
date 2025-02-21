import java.io.*;

public class BufferedFileCopy {
    public static void main(String[] args) {
        String sourceFile = "largefile.txt"; // Replace with actual large file path
        String destinationFile = "copied_largefile.txt";

        long startTime, endTime;

        // Copy using Buffered Streams
        startTime = System.currentTimeMillis();
        copyFileUsingBufferedStream(sourceFile, destinationFile);
        endTime = System.currentTimeMillis();
        System.out.println("Buffered Streams Copy Time: " + (endTime - startTime) + " ms");

        // Copy using Normal Streams
        startTime = System.currentTimeMillis();
        copyFileUsingNormalStream(sourceFile, destinationFile);
        endTime = System.currentTimeMillis();
        System.out.println("Normal Streams Copy Time: " + (endTime - startTime) + " ms");
    }

    private static void copyFileUsingBufferedStream(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[8192]; // 8KB buffer size
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully using Buffered Streams.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void copyFileUsingNormalStream(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully using Normal Streams.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
