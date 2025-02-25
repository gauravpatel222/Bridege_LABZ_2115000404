import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OpenCV {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Gaurav\\Desktop\\csvAssignment\\src\\main\\java\\data.csv";
        String outputFile = "C:\\Users\\Gaurav\\Desktop\\csvAssignment\\src\\main\\java\\target.csv";

        try (CSVReader reader = new CSVReader(new FileReader(inputFile));
             CSVWriter writer = new CSVWriter(new FileWriter(outputFile))) {

            List<String[]> allData = reader.readAll(); // Read all rows at once
            List<String[]> updatedData = new ArrayList<>();

            boolean isHeader = true;
            for (String[] row : allData) {
                if (isHeader) {
                    updatedData.add(row); // Keep header unchanged
                    isHeader = false;
                    continue;
                }

                if (row.length < 4) continue; // Ensure valid row

                String department = row[2].trim(); // Get department
                if (department.equalsIgnoreCase("IT")) {
                    double salary = Double.parseDouble(row[3].trim()); // Convert salary to number
                    salary *= 1.10; // Increase by 10%
                    row[3] = String.format("%.2f", salary); // Format back to string
                }

                updatedData.add(row);
            }

            writer.writeAll(updatedData); // Write back to new file
            System.out.println("Salaries updated successfully and saved to: " + outputFile);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
