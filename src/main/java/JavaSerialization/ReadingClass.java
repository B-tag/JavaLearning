package JavaSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingClass {


    public void readingFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("NewListofCars.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car[] cars = (Car[]) objectInputStream.readObject();
        for (Car anyCar : cars) {
            System.out.println(anyCar);
        }
        objectInputStream.close();
    }
}
