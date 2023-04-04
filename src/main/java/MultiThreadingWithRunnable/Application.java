package MultiThreadingWithRunnable;

public class Application {
    public static void main(String[] args) {

        Thread thread01=new Thread(new StartThread());
        Thread thread02=new Thread(new StartThread());
        Thread thread03=new Thread(new StartThread());
        Thread thread04=new Thread(new StartThread());

        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();

    }
}
