public class ThreadSchedulingExample {
    public static void main(String[] args) {
        System.out.println("Hello1");
        Thread lowPriorityThread = new Thread(() -> {
            System.out.println("Low priority thread running");
        }
        );
        System.out.println("Hello2");
        Thread highPriorityThread = new Thread(() -> {
            System.out.println("High priority thread running");
        }
        );
        System.out.println("Hello3");
        
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
