public class exampleofheirarchy {
    String d="Hello";
    String e="World";
    exampleofheirarchy(){

    }
    public static void main(String[] args) {
        a obj1 = new a();
        b obj2=new b();
    }
}
class a extends exampleofheirarchy{
    a(){
        System.out.println(d);
    }
}
class b extends exampleofheirarchy{
    b(){
        System.out.println(e);
    }
}