package MultiThreadingWithThreadClass;

public class Application {

    public static void main(String[] args) {

        StartThread startThread01 = new StartThread();
        startThread01.threadName = "Thread 01";
        StartThread startThread02 = new StartThread();
        startThread02.threadName = "Thread 02";
        StartThread startThread03 = new StartThread();
        startThread03.threadName = "Thread 03";

        startThread01.start();
        startThread02.start();
        startThread03.start();

//        startThread01.run();

    }
}
