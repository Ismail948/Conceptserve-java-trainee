class ins{
    void example(int f){
        System.out.print(f);
        System.out.println("Hello ");
    }
}
class methodoverridee extends ins{
    // void example(){
    //     System.out.println("World");
    // }
    public static void main(String args[])
    {
        methodoverridee obj1=new methodoverridee();
        methodoverridee obj4=new methodoverridee();
        ins obj2=new ins();
        obj1.example(20);
        obj4.example(55);
}
}