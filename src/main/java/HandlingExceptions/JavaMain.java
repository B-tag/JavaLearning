package HandlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaMain {

    public static void main(String[] args) {

        String path = "E:\\Java\\JavaPractice\\new.txt";
        read(path);

    }

    // try catch
    private static void read(String path) {
        File file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found !!!");
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String next = scanner.next();
            System.out.println(next);
        }
        scanner.close();
    }

}



