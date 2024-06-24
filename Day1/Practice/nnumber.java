public class nnumber {
    public static int sumofn(int a)
    {
        int i,sumn=0;
        for(i=0;i<=a;i++)
        {
            sumn=sumn+i;
        }
        return sumn;
    }
    public static void main(String[] args) {
        int sum=sumofn(10);
        System.err.println(sum);
    }
}
