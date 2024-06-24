import java.util.Scanner;
public class result {
    static boolean examres(int marks)
    {
        if(marks>50)
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        int marks=obj1.nextInt();
        boolean abc=examres(marks);
        if(abc==true)
        {
            System.out.println("Pass");
        }
        if(abc==false)
        {
            System.out.println("Fail");
        }
       
    }
}
