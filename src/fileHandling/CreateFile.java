package fileHandling;
import java.io.*;
import java.util.*;

public class CreateFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter file name:");
            String name = sc.nextLine();

            File file = new File(name);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
        }

        sc.close();
    }
}
