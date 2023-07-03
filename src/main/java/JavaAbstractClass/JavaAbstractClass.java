package JavaAbstractClass;

public class JavaAbstractClass {

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
        };
        abstractClass.test01();

        myCarClass.test01();

    }

}
