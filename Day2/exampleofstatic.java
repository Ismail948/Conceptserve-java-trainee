public class exampleofstatic {
    //Access this variable in main function without object or class.
    static int a=10;
    //Access this method in main function without object.
    public static void abc(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        System.out.println(a);
        abc();
    }
}