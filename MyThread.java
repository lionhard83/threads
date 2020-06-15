package thread;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            super.sleep((int) (Math.random()* 1000));
            System.out.println(super.getName());
        } catch(Exception e) {

        } 
    }
}