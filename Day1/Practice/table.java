import java.util.Scanner;
import java.math.*;
class table
{
    static void tableformat(int a)
    {
        int i;
        for(i=1;i<11;i++)
        {
            System.out.printf("%d * %d = %d\n",a,i,a*i);
        }
    }
    public static void main(String args[])
    {
        int a;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value you want to get table of:");
        a=obj.nextInt();
        if(a==5)
        {
            tableformat(a);
        }
        else 
        {
            System.out.println("Enter 5");
        }

      

    }

}