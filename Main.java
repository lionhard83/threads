package thread;

public class Main {
    public static void main(String args[]) {
        // TestA b = new TestA();
        // double x = b.generateRandom();
        // System.out.println(x);

        MyThread m1 = new MyThread("Jamaica");
        MyThread m2 = new MyThread("Fiji");
        m1.start();
        m2.start();
        System.out.println("Thread principale");

        MyRunnable r1 = new MyRunnable("Fiji");
        MyRunnable r2 = new MyRunnable("Jamaica");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}