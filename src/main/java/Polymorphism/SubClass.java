package Polymorphism;

public class SubClass extends SuperClass {

    public void showInfoPoly() {
        System.out.println("\n(SubClass)My name is : " + name);
        System.out.println("(SubClass)I'm " + age + " years old\n");
    }

    // Overriding must have exactly the same parameter
    // Below did not implement in superClass
//    public void showInfo(String name){
//        System.out.println("another ShowInfo Method");
//    }


    @Override
    public void showInfo(int age, String name) {
        System.out.println("Override 'int','String'");
    }

    @Override
    public void showInfo(String name, int age) {
        System.out.println("Override 'String','int'");
    }
}
