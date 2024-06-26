public class threadexam extends Thread {
    public static int amount=0;
    public static void main(String[] args) {
        threadexam obj=new threadexam();
        Thread obj1=new Thread(obj);
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // obj1.setPriority(1);
        System.out.println("Value of amount before sending it to Thread: "+amount);
        obj1.start();
        System.out.println("Value of amount after sending it to Thread: "+amount);
        amount++;
    System.out.println("Value of amount after increment: "+amount);
    }
    public synchronized void run() {
        amount++;
        System.out.println("Value of amount in Thread: "+amount);
      }
}