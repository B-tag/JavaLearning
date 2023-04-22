package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationRead {

    public static void readSerialFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("NewListOfCars.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Vehicle[] vehicles = (Vehicle[]) objectInputStream.readObject();
        for (Vehicle anyVehicle : vehicles) {
            System.out.println(anyVehicle);
        }
        objectInputStream.close();
    }

}
