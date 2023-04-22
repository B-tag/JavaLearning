package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWrite {

    public static void writeSerialFile(Car[] carsCreation) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("NewListOfCars.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(carsCreation);
        objectOutputStream.close();
    }

}
