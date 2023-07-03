package JavaInheritance;

import JavaInheritance.InheritateFroClass.SuperClass;

public class JavaMainClass extends SuperClass {

// it's possible to override any method of super class
    @Override
    public void overRideMethod(){
        System.out.println("This is Sub Class Method");
    }

    public static void main(String[] args) {

        JavaMainClass  javaMainClass=new JavaMainClass();
        SuperClass  superClass=new SuperClass();

            javaMainClass.age=25;
            javaMainClass.name="Tester";
            show(javaMainClass);

            // this method is superClass override method
            javaMainClass.overRideMethod();

            // this method is super class method
            superClass.overRideMethod();

    }
}
