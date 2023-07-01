package Encapsulation;

public class EncClass {

    // Private members for Encapsulation
    private int age;
    private String name;
    private String family() {
        return "Testing";
    }


    public void getFamily() {
        System.out.println("MY family is : " + family());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
