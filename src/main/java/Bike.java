import java.io.Serializable;

public class Bike implements Serializable {

    public int serialNumber;
    public String name;
    public String color;

    @Override
    public String toString() {
        return "Bike :" +
                "serialNumber=" + serialNumber +
                " , name='" + name + '\'' +
                " , color='" + color + '\'';
    }
}
