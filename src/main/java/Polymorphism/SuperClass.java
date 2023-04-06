package Polymorphism;

public class SuperClass {

    public int age;
    public String name;

    public void showInfo() {
        System.out.println("\nMy name is : " + name);
        System.out.println("I'm " + age + " years old\n");
    }
    public void showInfo(int age, String name) {
        System.out.println("\nMy name is : " + name);
        System.out.println("I'm " + age + " years old\n");
    }

    public void showInfo(String name, int age) {
        System.out.println("\nMy name is : " + name);
        System.out.println("I'm " + age + " years old\n");
    }

    public void showInfoPoly() {
        System.out.println("\n(Super)My name is : " + name);
        System.out.println("(Super)I'm " + age + " years old\n");
    }
}
