public class Returnfrommethod {
    int sum(int a,int b)
    {
        int c=a+b;
        return c;
    }
public static void main(String[] args) {
    int a=5,b=20;
    Returnfrommethod obj1=new Returnfrommethod();
    int ans=obj1.sum(a,b);
    System.out.printf("%d",ans);

}

}

