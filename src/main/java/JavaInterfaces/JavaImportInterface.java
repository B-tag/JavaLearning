package JavaInterfaces;

public class JavaImportInterface implements JavaInterface {

    int age;
    String name,surname;

    public JavaImportInterface(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public JavaImportInterface() {
    }

    @Override
    public void showInfo() {
        System.out.println("There is no info");
    }

    @Override
    public void showInfo(int age) {
        System.out.println("I am " + age + " years old.");
    }

    @Override
    public void showInfo(String name) {
        System.out.println("My name is " + name + ".");
    }
}
