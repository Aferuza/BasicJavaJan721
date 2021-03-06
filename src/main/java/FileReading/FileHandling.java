package FileReading;
// Import the File class
import java.io.File;

// Import this class to handle errors
import java.io.FileNotFoundException;

// Import the Scanner class to read text files
import java.util.Scanner;

public class FileHandling {
  public static void main(String[] args) {
        try {
// Creating an object of the file for reading the data
            File myObj = new File("D:FileHandlingNewFilef1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
