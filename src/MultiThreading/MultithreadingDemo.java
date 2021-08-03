package MultiThreading;

public class MultithreadingDemo {
    public static void main(String[] args) {
        Threads_By_Runnable threadOne = new Threads_By_Runnable("Child 1");
        Thread newThread = new Thread(threadOne);

        newThread.start();
    }
}
