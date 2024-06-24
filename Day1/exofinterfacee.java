interface sum{
    void print_hello();
}
public class exofinterfacee implements sum {
    public void print_hello()
    {
        System.out.println("Hello");
    }
    public static void main(String args[])
    {
       exofinterfacee obj1=new exofinterfacee();
       obj1.print_hello();
    
    }
}
