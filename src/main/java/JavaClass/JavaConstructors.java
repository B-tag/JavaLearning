package JavaClass;

public class JavaConstructors {

    public int age;
    public String name;

    private int serialNumber;

    public JavaConstructors() {
        this.serialNumber = 10;
    }

    public JavaConstructors(int age) {
        this.age = age;
    }

    public JavaConstructors(String name) {
        this.name = name;
    }

    public JavaConstructors(int serialNumber, String name, int age) {
        this.name = name;
        this.age = age;
        this.serialNumber = serialNumber;
    }

    public int getSerialnumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}
