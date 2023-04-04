package MultiThreadingWithThreadClass;

public class StartThread extends Thread {
    public String threadName;

    public void run() {
        for (int i = 0; i < 18; i++) {
            System.out.println(threadName + " Loop counter : " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
