package Serialization;

import java.io.*;

public class JavaMainSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // write to a file
        Car[] carsCreation = {new Car(123, "Renault01", "White01")
                , new Car(1111, "Renault012", "White022")
                , new Car(2222, "Renault0113", "White0113")
                , new Car(3333, "Renault05654", "White56504")};
        FileOutputStream fileOutputStream = new FileOutputStream("NewListofCars.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(carsCreation);
        objectOutputStream.close();

        // read from a file
        FileInputStream fileInputStream = new FileInputStream("NewListofCars.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Car[] cars = (Car[]) objectInputStream.readObject();
        for (Car anyCar : cars) {
            System.out.println(anyCar);
        }
        objectInputStream.close();

    }
}
