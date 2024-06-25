import java.io.*;
import java.util.*;

public class exampleoffilehandle  {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.print("Do you want to create new file? yes/no:");
        String yno=src.nextLine();
        if(yno.equals("yes")){
            System.out.println("Enter file name");
            StringBuffer fname=new StringBuffer();
            StringBuffer typ=new StringBuffer();
            fname.append(src.nextLine());
            System.out.println("Press 1 for java file");
            System.out.println("Press 2 for Python file");
            System.out.println("Press 3 for txt file");
            int ftype=src.nextInt();
            if(ftype==1){
                fname.append(".java");
            }
            else if(ftype==2){
                fname.append(".py");
            }
            else if(ftype==1){
                fname.append(".txt");
            }
            else{
                System.out.println("Enter Valid");
            }
            String finalf=fname.toString();
            File myfile=new File(finalf);
            try{
                myfile.createNewFile();
                System.out.println("Successfully Created");
            }
            catch(IOException e){
                System.out.println("Unable to Create new File");
                e.printStackTrace();
            }
        }
        else if(yno.equals("no")){
            System.out.println("File not created");
        }
        else{
            System.out.println("Enter valid option");
        }
        // File myfff  = new File("abc.txt");
        // myfff.delete();//delete file
     
    }
}