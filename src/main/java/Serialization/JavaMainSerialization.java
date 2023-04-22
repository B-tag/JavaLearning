package Serialization;

import java.io.IOException;

public class JavaMainSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // write to a file
        Car[] carsCreation = {new Car(123, "Renault01", "White01")
                , new Car(1111, "Renault012", "White022")
                , new Car(2222, "Renault0113", "White0113")
                , new Car(3333, "Renault05654", "White56504")};
        SerializationWrite.writeSerialFile(carsCreation);

        // read from a file
        SerializationRead.readSerialFile();

    }


}
