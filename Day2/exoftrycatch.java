import java.util.concurrent.ExecutionException;

public class exoftrycatch {
    static void fun(){
        int []a;
        a=new int[5];
        try {
            // for(int i=0;i<=10;i++){
            //     System.out.println(a[i]);
            // }
            // int f=a[10];
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
    public static void main(String[] args) {
        int a;
        int[] arr = new int[4];
        try
        {
            int i = arr[4];
            System.out.println("abc");
            throw new NullPointerException("demo");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Finally Block");
        }
        try{
            int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        try{
            fun();
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Cought in Main");
        }
    }
}
