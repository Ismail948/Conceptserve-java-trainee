public class throwerr {
    throwerr(){
        int a=0;
        int b=5;
        try{
            int c=b/a;
        }
        catch(Exception e){
            // System.out.println("Error name:---->" +e);
            throw e;
        }

    }
    public static void main(String[] args) {
        try{
            throwerr obj1=new throwerr();
        }
        catch(Exception e){
            System.out.println("Main function:--->"+e);
        }
    }
}
