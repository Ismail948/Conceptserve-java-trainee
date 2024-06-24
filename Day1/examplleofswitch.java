public class examplleofswitch {
    public examplleofswitch(int f){
        switch(f)
        {
            case 1:System.out.println("Distinction"); break;
            case 2:System.out.println("First Class");break;
            case 3:System.out.println("Average");break;
            default:System.out.println("Fail");break;
        }
    }
    public static void main(String args[])
    {
        examplleofswitch obj1=new examplleofswitch(10);
    }
}
