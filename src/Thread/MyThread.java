package Thread;

public class MyThread extends Thread {
    @Override
    public void run() {

            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("run="+Thread.currentThread().getName());
            }

    }
}
