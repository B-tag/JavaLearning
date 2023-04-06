package JavaInterfaces;

public class JavaMain {
    public static void main(String[] args) {

        JavaImportInterface object01=new JavaImportInterface();
        JavaImportInterface object02=new JavaImportInterface(53,"Test Man","Testing");

        object01.showInfo();
        object01.showInfo(23);
        object01.showInfo("Tester");

        System.out.println("-------------------------");
        object02.showInfo(object02.age);
        object02.showInfo(object02.name);

    }
}
