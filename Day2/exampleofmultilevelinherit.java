class a{
    int a=25;
}
class b extends a{

}
public class exampleofmultilevelinherit extends b{
    exampleofmultilevelinherit(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        exampleofmultilevelinherit obj1=new exampleofmultilevelinherit();
    }
}
