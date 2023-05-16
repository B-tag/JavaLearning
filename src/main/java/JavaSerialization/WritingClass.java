package JavaSerialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingClass {

    public void extracted(Car[] carsCreation) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("NewListofCars.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(carsCreation);
        objectOutputStream.close();
    }

}
