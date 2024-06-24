import java.util.Scanner;
class classinstance {
    public static int encapsulatedval=10;
    classinstance(int a)
    {
        int i,sumn=0;
        for(i=0;i<=a;i++)
        {
            sumn=sumn+i;
        }
        System.err.println(sumn);
    }
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.err.println("Enter the value you want to get sum of");
        int val=obj1.nextInt();
        classinstance const123=new classinstance(val);
        
        
        System.err.println(classinstance.encapsulatedval);
    }
} 
