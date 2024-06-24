class person{
    String name;
    int age;
    void per(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name"+name);
        System.out.println("Age"+age);
    }
}
public class practiceins extends person{
   public static void main(String[] args) {
    practiceins obj1= new practiceins();
    obj1.per("Ismail",19);
   }
}

