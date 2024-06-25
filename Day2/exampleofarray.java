import java.util.Scanner;
public class exampleofarray{
    exampleofarray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        int[]a=new int[10];
        for(int i=0;i<a.length;i++){
            a[i]=src.nextInt();
        }
        exampleofarray obj1=new exampleofarray(a);
    }
}