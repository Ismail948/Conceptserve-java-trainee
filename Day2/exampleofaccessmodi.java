class a{
    public int a=10;
    private int b=20;
    protected int c=30;
}
class b extends a{
    b(){
        System.out.println(a);//Access a
        //System.out.println(b);//cannot Access b
        System.out.println(c);//Access c
    }
}
public class exampleofaccessmodi extends b{
    exampleofaccessmodi(){
        System.out.println(a);//Access a
        //System.out.println(b);//Cannot Access b
        System.out.println(c);//Access c
    }
    public static void main(String args[]){
        b obj1=new b();
        exampleofaccessmodi obj2=new exampleofaccessmodi();
    }
    
}