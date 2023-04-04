import java.io.*;

public class Serialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // write to a file
        Car[] carsCreation = {new Car(123, "Renault01", "White01")
                , new Car(15523, "Renault02", "White02")
                , new Car(16623, "Renault03", "White03")
                , new Car(18823, "Renault04", "White04")};
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
