package Serialization;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private int VNI;
    private String brand;
    private String color;

    public Vehicle(int VNI, String brand, String color) {
        this.VNI = VNI;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car : " +
                "VNI=" + VNI +
                " , brand='" + brand + '\'' +
                " , color='" + color + '\'';
    }
}
