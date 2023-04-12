package AnonnymousClass;

class Computer{
    public void showInfo(){
        System.out.println("This is information fo the computer");
    }
    public void shutDown(){
        System.out.println("Computer is shutting down");
    }
}

interface Phone{
    public void call();
}

public class JavaMain {

    public static void main(String[] args) {

        Computer computer01=new Computer();
        computer01.shutDown();
        computer01.showInfo();

        System.out.println("*************************");
        Computer  computer02=new Computer(){
            @Override
            public void shutDown(){
                System.out.println("Windows PC is shutting down.");
            }
        };
        computer02.shutDown();
        computer02.showInfo();

        System.out.println("*************************");
        Phone phone01=new Phone() {
            @Override
            public void call() {
                System.out.println("Calling ... ");
            }
        };
        phone01.call();

    }
}
