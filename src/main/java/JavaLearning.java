import java.io.*;

public class JavaLearning {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Creating objects
        Car car01 = new Car(111, "BMW", "RED");
        Car car02 = new Car(222, "Audi", "Blue");
        Car car03 = new Car(333, "Tesla", "Green");

        Bike bike01 = new Bike();
        Bike bike02 = new Bike();

        bike01.name = "Carera";
        bike01.color = "Pink";
        bike01.serialNumber = 7788;

        bike02.name = "Carbondale";
        bike02.color = "White";
        bike02.serialNumber = 1122;


        //Export objects to a file
        FileOutputStream fileOutputStream = new FileOutputStream("test.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(car01);
        objectOutputStream.writeObject(car02);
        objectOutputStream.writeObject(car03);
        objectOutputStream.writeObject(bike01);
        objectOutputStream.writeObject(bike02);

        objectOutputStream.close();

        //Import objects from a file
        FileInputStream fileInputStream = new FileInputStream("test.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object object01 = objectInputStream.readObject();
        Object object02 = objectInputStream.readObject();
        Object object03 = objectInputStream.readObject();
        Object object04 = objectInputStream.readObject();
        Object object05 = objectInputStream.readObject();

        Object[] allObjects = {object01, object02, object03, object04, object05};

        for (Object myObject : allObjects) {

            System.out.println(myObject);
        }
        objectInputStream.close();
    }
}
