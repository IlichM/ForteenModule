package SynchThreads;


public class SynchThreadDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();

        SynchThreads threadOne = new SynchThreads("Synchronized Thread One", counter);
        SynchThreads threadTwo = new SynchThreads("Synchronized Thread Two", counter);

        threadOne.start();
        threadTwo.start();

        try {
            threadOne.join();
            threadTwo.join();
        }catch (InterruptedException e){
            System.out.println("Threads interrupted.");
            e.printStackTrace();
        }
    }
}