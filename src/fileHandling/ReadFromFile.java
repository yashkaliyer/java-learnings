package fileHandling;
import java.io.*;
import java.util.*;
public class ReadFromFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the file name you want to read");
            String name = sc.nextLine();
            FileReader reader = new FileReader(name);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while((line = br.readLine()) !=null){
                System.out.println(line);
            }
            br.close();
        }catch(IOException e){
            System.out.println("Could not read file");
        }
        sc.close();
    }
}
