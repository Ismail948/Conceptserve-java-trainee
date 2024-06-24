public class methodoverloadd {
    int abc()
    {
        return 1;
    }
    int abc(int a)
    {
        return 2;
    }
    public static void main(String args[])
    {
        methodoverloadd obj1=new methodoverloadd();
        int ans;
        ans=obj1.abc();
        System.out.println(ans);
        ans=obj1.abc(20);
        System.out.println(ans);
    }
}
