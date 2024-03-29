package JavaAbstractClass;

public abstract class AbstractClass {

    int serialNumber;
    String car;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    // must implement in extended classes
    public abstract void test01();
    public abstract void test02();
}
