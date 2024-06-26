public class synchronizedmultithread extends Thread{
    public static synchronized Runnable onetoten(){
        return new Runnable() {
            public void run() {
                for(int i=1;i<=10;i++){
                    System.out.println(i);
                }
                
            }
        };
}
    public static Runnable onetofive(){
        return new Runnable() {
            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println(i);
                }
            }
        };
    }
    public static void main(String[] args) {
        Thread obj1 = new Thread(onetoten());
        obj1.start();
        Thread obj2=new Thread(onetoten());
        obj2.start();
    }
}
