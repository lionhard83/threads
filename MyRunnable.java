package thread;

public class MyRunnable extends Object implements Runnable{

    private String name;
    public MyRunnable(String name) {
      this.name = name;
    }

    @Override
    public void run() {
      try {
        Thread.sleep((int) (Math.random()* 1000));
        System.out.println("sono nel runnable" + this.name);
      } catch(Exception e) {

      } 
    }
    
}