class MyRunnable implements Runnable {
    public void run() {
       System.out.println("MyRunnable is running");
    }
 }
 
 public class Runn {
    public static void main(String[] args) {
       // Create an instance of MyRunnable
       Runnable runnable = new MyRunnable();
       
       // Create a new thread and pass the runnable instance as a parameter
       Thread thread1 = new Thread(runnable);
       Thread thread2 = new Thread(runnable);
       // Start the new thread
       thread1.start();
       thread2.start();
    }
 }
 