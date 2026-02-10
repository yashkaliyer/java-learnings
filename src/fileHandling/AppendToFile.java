package fileHandling;
import java.io.*;
import java.util.*;
public class AppendToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the file name you want to append");
            String name = sc.nextLine();
            System.out.println("Enter the text you want to add");
            String text = sc.nextLine();
            FileWriter writer = new FileWriter(name, true);
            writer.write(text + "\n" );
            writer.close();
            System.out.println("text appended successfully");
            FileReader reader = new FileReader(name);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) !=null){
                System.out.println( line);
            }
            br.close();

        }
        catch(IOException e){
            System.out.println("an error occurred ");
        }
        sc.close();
    }
}
