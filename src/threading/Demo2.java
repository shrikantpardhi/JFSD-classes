package threading;

public class Demo2 implements Runnable {
    @Override
    public void run() {
    }
    public static void main(String[] args) {
        Thread obj = new Thread();
        
        obj.start();
        
        try {
        	obj.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj.setPriority(1);
        int gurupriority = obj.getPriority();
        System.out.println(gurupriority);
        System.out.println("Thread Running");
  }
}
 