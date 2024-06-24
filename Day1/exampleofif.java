import java.util.Scanner;
class exampleofif{
    public exampleofif(int a)
    {
    if(a>=0 && a<=100){
        if(a>=33 && a<=100)
        {
            System.out.println("Pass");
        }
        else if(a<33) {
            System.out.println("Fail");
        }
    }
    else{
        System.out.println("Invalid marks");
    }

    }
    public static void main(String args[])
    {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter Your Marks");
        int marks=obj1.nextInt();
        exampleofif obj2=new exampleofif(marks);

    }
}