class abc{
    void printhello(){
        System.out.println("Hello");
    }
}
public class exampleofclass extends abc {
    public static void main(String[] args) {
        exampleofclass obj1=new exampleofclass();
        obj1.printhello();
    }
}
