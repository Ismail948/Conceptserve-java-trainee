import java.util.Scanner;
public class practiceofdata {
    public void fartocel(float far)
    {
        float celcius=(((far-32)*5)/9);
        System.out.println("Farhenite :"+far);
        System.out.println("Clecius :"+celcius);
    }
    public void inchfeet(int inchf,int leftover)
    {
       System.out.println(inchf+"."+leftover);

    }
    public void addthedigit(int value)
    {
        int a;
        int b;
        int c;
        if(value>0 && value<=1000)
        {
            c=value%10;
            value/=10;
            b=value%10;
            value/=10;
            a=value%10;
            System.out.println(a+b+c);
        }
    }
    public void yeardays(int min){
        int year=(min/(525600));
        int abc=(min%(525600));
        int days=abc/1440;
        System.out.println(year+" Years "+days+" Days");
    }
    public static void main(String args[])
    {
        float far;
        practiceofdata obj1=new practiceofdata();
        Scanner src=new Scanner(System.in);
        // System.out.println("Enter Frhenite");
        // far=src.nextFloat();
        // obj1.fartocel(far);
        // System.out.println("Enter Inches");
        // int inch=src.nextInt();
        // int feet=inch/12;
        // int leftover=inch%12;
        // obj1.inchfeet(feet,leftover);
        // System.out.println("Enter Number");
        // int value=src.nextInt();
        // obj1.addthedigit(value);
        // System.out.println("Enter Minuites");
        // int min=src.nextInt();
        // obj1.yeardays(min);
    }
}
