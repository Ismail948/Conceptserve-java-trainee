
public class exampleofstaticclass {
    public static class hello{
        hello(){
            System.out.print("Hello ");
        }
        void world(){
            System.out.println("World");
        }
    }    
    public static void main(String[] args) {
        hello obj1=new hello();
        obj1.world();
    }
}
