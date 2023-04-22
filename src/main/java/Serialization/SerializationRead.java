package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationRead {

    public static void readSerialFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("NewListOfCars.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car[] cars = (Car[]) objectInputStream.readObject();
        for (Car anyCar : cars) {
            System.out.println(anyCar);
        }
        objectInputStream.close();
    }

}
