package JavaSerialization;

import java.io.*;

public class SerializationMain {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WritingClass writingClass=new WritingClass();
        ReadingClass readingClass=new ReadingClass();

        Car[] carsCreation = {new Car(123, "Renault01", "White01")
                , new Car(15523, "Renault02", "White02")
                , new Car(16623, "Renault03", "White03")
                , new Car(18823, "Renault04", "White04")};

        // write to a file
//        writingClass.extracted(carsCreation);

        // read from a file
//        readingClass.readingFile();

    }

}
