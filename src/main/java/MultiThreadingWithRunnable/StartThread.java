package MultiThreadingWithRunnable;

public class StartThread implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 18; i++) {
            System.out.println(" Loop counter : " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
