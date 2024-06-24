public class exofstatic {
    static String Comtyp;
    int com_id;
    String com_name;
    public exofstatic(int com_id,String com_name)
    {
        this.com_id=com_id;
        this.com_name=com_name;
        System.out.println("Company id :"+com_id+"  Company name :"+com_name+"."+Comtyp);
    }

    public static void main(String args[])
    {
        exofstatic.Comtyp="LTD";
        exofstatic obj1=new exofstatic(1,"Toyota");
        exofstatic obj2=new exofstatic(2,"Honda");
        exofstatic obj3=new exofstatic(3,"BYD");
        exofstatic.Comtyp="Private_Limited";
        exofstatic obj4=new exofstatic(1,"Concept_Serve");
        exofstatic obj5=new exofstatic(1,"Mercedes");
    }

}
