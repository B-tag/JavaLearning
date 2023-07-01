package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaMain {

    public static void main(String[] args) throws FileNotFoundException {

        String path = "E:\\Java\\JavaPractice\\new.txt";
//         E:\Java\JavaPractice\new.txt

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        System.out.println("The int value_01 : " + scanner.nextInt());
        System.out.println("The int value_02 : " + scanner.nextInt());

        while (scanner.hasNextLine()) {
            String next = scanner.next();
            System.out.println(next);
        }

        System.out.println("\n----------------");
        System.out.println("\nNew read :");
        scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String next = scanner.next();
            System.out.println(next);
        }
        scanner.close();
    }
}
