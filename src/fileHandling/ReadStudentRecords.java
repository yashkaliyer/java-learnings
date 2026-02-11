package fileHandling;
import java.io.*;
import java.util.*;

public class ReadStudentRecords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter file name:");
            String name = sc.nextLine();

            BufferedReader br =
                    new BufferedReader(new FileReader(name));

            String line;

            while((line = br.readLine()) != null){

                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String studentName = parts[1];
                int marks = Integer.parseInt(parts[2]);

                System.out.println(
                        "ID: " + id +
                                " Name: " + studentName +
                                " Marks: " + marks
                );
            }

            br.close();

        } catch(Exception e){
            System.out.println("Error processing file");
        }

        sc.close();
    }
}
