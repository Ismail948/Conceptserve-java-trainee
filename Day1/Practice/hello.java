class hello
{
    void sumof()
    {
        int a=10,b=20;
        System.out.print("Method\t"+(a+b)+"\t");
        int c=a+b;
        int s=sumoffc(c);
        System.out.println(s);
    }
    int sumoffc(int c)
    {
        int f=c+10;
        return f;
    }
    hello(int f)
    {
        System.out.print("Constructor \t");
        System.out.println(f);
    }
    public static void helo()
    {
        System.out.println("Function");
    }
    public static void main(String args[])
    {
        int f=25;
        hello obj1=new hello(f);
        obj1.sumof();
        helo();
        System.out.println("Main function");
    }
}