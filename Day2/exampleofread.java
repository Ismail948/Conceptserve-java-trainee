import java.io.*;
public class exampleofread {
    public static void main(String[] args) {
        File obj1=new File("abc.txt");
        BufferedReader reader=null;
        try {
            reader = new BufferedReader(new FileReader("abc.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
