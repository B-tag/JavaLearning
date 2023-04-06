package Polymorphism;

public class JavaMain  {

    public static void main(String[] args) {

        SuperClass superClass01=new SuperClass();
        superClass01.name="root";
        superClass01.age=44;

        SuperClass superClass02=new SuperClass();
        superClass02.name="root02";
        superClass02.age=4004;
        superClass02.showInfo();

        superClass01.showInfo();
        superClass01.showInfo(25,"tester01");
        superClass01.showInfo(34,"tester02");

        SuperClass superClass03=new SubClass();
        // because of new Subclass , superClass03 is SubClass instance
        superClass03.showInfoPoly();

        SuperClass subClass03=new SuperClass();
        // because of new SuperClass , superClass03 is SuperClass instance
        subClass03.showInfoPoly();



    }
}
