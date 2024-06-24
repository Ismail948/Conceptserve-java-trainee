abstract class absse{
    public abstract void hello();
    public void sumofab()
    {
        int a=10,b=20;
        System.out.println(a+b);
    } 
    
}
class abc extends absse{
    public void hello()
    {
        System.out.println("Abstraction");
    }
}

class exofabs{
    public static void main(String args[])
    {
        abc obj1=new abc();
        obj1.hello();
        obj1.sumofab();
    }
}