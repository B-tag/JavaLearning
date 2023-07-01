package Encapsulation;

public class JavaMain {
    public static void main(String[] args) {
        EncClass encClass = new EncClass();

        encClass.setAge(25);
        int age = encClass.getAge();
        System.out.println(age);

        encClass.setName("Test");
        String name = encClass.getName();
        System.out.println(name);

        encClass.getFamily();
    }
}
