package JavaInterfaces;

public class JavaMain {
    public static void main(String[] args) {

        JavaInterfaceImp object01=new JavaInterfaceImp();
        JavaInterfaceImp object02=new JavaInterfaceImp(53,"Test Man","Testing");

        object01.showInfo();
        object01.showInfo(23);
        object01.showInfo("Tester");

        System.out.println("-------------------------");
        object02.showInfo(object02.age);
        object02.showInfo(object02.name);

        //  object01.a=10; not allowed
        System.out.println(object01.a);

        //  object01.b="er"; not allowed
        System.out.println(object01.name);


    }
}
