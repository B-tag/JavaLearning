package JavaAbstractClass;

<<<<<<<< HEAD:src/main/java/JavaAbstractClass/MainJavaClass.java
public class MainJavaClass {
========
public class JavaMain {
>>>>>>>> 77972f3a2b3c7dc59b7a96a0f41cc6ba07b57129:src/main/java/JavaAbstractClass/JavaMain.java

    public static void main(String[] args) {

        MyCarClass myCarClass = new MyCarClass();

        myCarClass.carName = "Tesla";
        myCarClass.serialNumber = 123;

        // only we can instantiate when we have an
        // abstract method in Abstract class
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            public void test01() {
                System.out.println("Main class Test 01 method");
            }

            @Override
            public void test02() {

            }
        };
        abstractClass.test01();
        abstractClass.test02();

        myCarClass.test01();

    }

}
