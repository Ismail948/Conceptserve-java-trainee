package Revision;
import java.io.*;
import java.util.*;
public class arraylistt {
    static ArrayList obj1=new ArrayList<>();
    public static void start(){
        System.out.println("");
        System.out.println("");
        System.out.println("*****Menu*****");
        Scanner src=new Scanner(System.in);
        System.out.println("1. Display ArrayList");
        System.out.println("2. Operations on ArrayList");
        System.out.println("");
        System.out.println("Enter your Choice:-");
        int choice=src.nextInt();
        if(choice==1){
            System.out.println(obj1);
            restart();
        }
        else if(choice==2) {
            System.out.println("");
            System.out.println("***Operations***");
            System.out.println("1 . Add data");
            System.out.println("2. Delete data");
            System.out.println("3. Go back");
            System.out.println("");
            System.out.println("Enter your Choice:-");
            int choice2=src.nextInt();
            if(choice2==1){
                System.out.print("Enter the value: ");
                int f=src.nextInt();
                obj1.add(f);
                System.out.println("Value Successfully added");
                System.out.println("Do you want to perform further tasks?");
                System.out.println("1. YES");
                System.out.println("2. NO");
                int yorn=src.nextInt();
                if(yorn==1){
                    restart();
                }
                else if(yorn==2){
                    System.out.println("Thank you for using or program");
                }
                else{
                    System.out.println("Enter valid option");
                }
            }
            else if(choice2==2){
                System.out.print("Enter the value: ");
                int f=src.nextInt();
                obj1.remove(f);
                System.out.println("Value Successfully Removed");
                System.out.println("Do you want to perform further tasks?");
                System.out.println("1. YES");
                System.out.println("2. NO");
                int yorn=src.nextInt();
                if(yorn==1){
                    restart();
                }
                else if(yorn==2){
                    System.out.println("Thank you for using or program");
                }
                else{
                    System.out.println("Enter valid option");
                }}
            else if(choice2==3){
                restart();
            }
            else{
                System.out.println("Enter Valid option");
                restart();
            }

        }
    }
    public static void restart(){
        start();
    }
    public static void main(String[] args) {
        start();
    }
}
