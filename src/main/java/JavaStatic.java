class Student {

    static int age;
    static String name;
    String family;
    final static boolean bool = false;

    public void showInfo() {
        System.out.println("Show info == Age : " + age + " - Name : " + name + " - Family : " + family);
//        bool=true;
    }
    public static void showInfoStatic() {
        System.out.println("Show info STATIC == Age : " + age + " - Name : " + name + " - Family : can not show because it's non-Static");
    }
}

public class JavaStatic {
    public static void main(String[] args) {
        Student student = new Student();
        Student student02 = new Student();

        student.family = "New Look";
        Student.name = "Testing";
        student.age = 45;
//        Student.showInfoStatic();
//        student.showInfo();
        Student.age = 23;
        Student.showInfoStatic();
        student.showInfo();

        student02.age = 98;
        Student.showInfoStatic();
        student.showInfo();

        // Doesn't matter you change the static variables where or when , the last
        // changes will apply for all different objects (Static means statically stores in the memory and
        // that member always in the same address for all objects of the class

        System.out.println("Class-object 02 : age= " + Student.age + " --- And object 02 age : " + student.age);
        System.out.println("Class-object 02 : age= " + Student.age + " --- And object 02 age : " + student02.age);

        student.showInfoStatic();
        // or
        Student.showInfoStatic();

        student02.showInfoStatic();
        // or
        Student.showInfoStatic();


    }
}
