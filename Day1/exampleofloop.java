public class exampleofloop {
    public exampleofloop(int val){
        int i;
        for(i=0;i<=val;i++)
        {
            System.out.println(i);
        }
        while (val>0){
            System.out.println(val);
            val--;
        }
        // do{
        //     System.out.println(i);
        //     i--;
        // }while(val<=0);
    }
    public static void main(String[] args) {
        exampleofloop obj1= new exampleofloop(10);
    }
}
