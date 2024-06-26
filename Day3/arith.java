public class arith{
    public static void main(String[] args) {
        try{//------>Arithmetic divide by zero error
           int a=0;
           int b=5;
           int c=b/a;
        }
        catch(Exception e){
            System.out.println("Error:-----"+e);
        }
        try{
        String mychar="HEllo";
        System.out.println(mychar.charAt(8));
        }
        catch(ArithmeticException e){
            System.out.println("Error thrown: "+e);
        }
        catch(Exception f){
            System.err.println("Error"+f);
        }
    }
}