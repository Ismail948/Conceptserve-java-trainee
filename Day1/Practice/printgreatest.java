import java.util.Scanner;
public class printgreatest {
    int a,b,c;
    public printgreatest(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is Greatest :"+a);
            }
            else{
                System.out.println("C is Greatest :"+c);
            }
        }
        else if(b>c){
            System.out.println("B is Greatest");
        }
        else{
            System.out.println("C is Greatest");
        }
    }
    public static void main(String args[])
    {
        int a,b,c;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter value of A: ");
        a=src.nextInt(); 
        System.out.println("Enter value of B: ");
        b=src.nextInt(); 
        System.out.println("Enter value of C: ");
        c=src.nextInt(); 
        printgreatest obj1=new printgreatest(a, b, c);
    }
}
