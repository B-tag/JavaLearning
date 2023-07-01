package Polymorphism;

public class JavaMain  {

    public static void main(String[] args) {

        SuperClass superClass01=new SuperClass();
        SuperClass superClass02=new SuperClass();
        SuperClass superClass03=new SubClass();

        SuperClass subClass03=new SuperClass();

        superClass01.name="root";
        superClass01.age=44;

        superClass02.name="root02";
        superClass02.age=4004;


        superClass01.showInfo();
        superClass01.showInfo(25,"tester01");
        superClass01.showInfo(34,"tester02");
        superClass02.showInfo();
//         because of new Subclass , superClass03 is SubClass instance
        superClass03.showInfoPoly();

        // because of new SuperClass , superClass03 is SuperClass instance
        subClass03.showInfoPoly();

        // can not call this method because it's not exist in SuperClass
//        subClass03.showInfo("Test");

        subClass03.showInfo("Test",23);



    }
}
