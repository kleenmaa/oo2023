import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("kiirused2.txt");
            Scanner scanner = new Scanner(file);

            // Read the first double value from the file
            double value = scanner.nextDouble();

            System.out.println("The value read from the file is: " + value);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}