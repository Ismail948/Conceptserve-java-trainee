class abc{
   int a=10;
   void printhello(){
    System.out.println("Hello");
   }
}
class def extends abc{
}

public class exampleofhe extends def{
    public exampleofhe(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        exampleofhe obj1=new exampleofhe();
        obj1.printhello();
}
}