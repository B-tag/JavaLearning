package JavaClass;

public class JavaMain {

    public static void main(String[] args) {

        JavaConstructors javaCons01 = new JavaConstructors(23);
        javaCons01.name = "Tester";

        JavaConstructors javaCons02 = new JavaConstructors("Tester");
        javaCons02.age = 45;

        JavaConstructors javaCons03 = new JavaConstructors(123, "Hello", 25);
        int serialnumber = javaCons03.getSerialnumber();

        JavaConstructors javaCons04 = new JavaConstructors();
        javaCons04.age = 25;
        System.out.println("Age : " + javaCons04.age);
        System.out.println("Serial : " + javaCons04.getSerialnumber());

        System.out.println("--Object03 Serial number is : " + serialnumber);
        System.out.println("--Object03 age is : " + javaCons03.age);
        System.out.println("--Object03 serial number is : " + javaCons03.getSerialnumber());
        System.out.println();
        System.out.println("--Object01 name is : " + javaCons01.name);
        System.out.println("--Object01 age is : " + javaCons01.age);
        System.out.println("--Object01 serial number is : " + javaCons01.getSerialnumber());
        System.out.println();
        System.out.println("--Object02 name is : " + javaCons02.name);
        System.out.println("--Object02 age is : " + javaCons02.age);
        System.out.println("--Object02 serial number is : " + javaCons02.getSerialnumber());

        System.out.println();
        javaCons02.setSerialNumber(4455);
        System.out.println("-----Object02 Serial number is changed to 4455-----");
        System.out.println("--Object02 serial number is : " + javaCons02.getSerialnumber());

    }

}
