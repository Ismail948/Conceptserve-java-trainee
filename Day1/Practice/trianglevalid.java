public class trianglevalid {
    public static int trivad(int a,int b,int c)
    {
        int d=a+b+c;
       if(d==180) {
        return d;

        }
        else{
            return 50;
        }
    }
    public static void main(String[] args) {
        int a=60,b=60,c=6;
        int d=trivad(a,b,c);
        if(d==180)
        {
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
