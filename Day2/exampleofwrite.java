import java.io.FileWriter;

public class exampleofwrite {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("hellabc.java"))
   {
            writer.write("Java 21st version");
            System.out.println("Successfully wrote to the file.");
    }
    catch(Exception e){
        System.out.println("Error Occured");
    }
}
}