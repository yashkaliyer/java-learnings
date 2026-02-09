package fileHandling;
import java.io.*;
import java.util.*;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the file name");
            String name = sc.nextLine();
            System.out.println("Enter text to write:");
            String text = sc.nextLine();
            FileWriter writer = new FileWriter(name);
            writer.write(text);
            writer.close();

            System.out.println("File created and written successfully");
        }
        catch(IOException e) {
            System.out.println("File error occurred");
        }
   sc.close();
    }
}
