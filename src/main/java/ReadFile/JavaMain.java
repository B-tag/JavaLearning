package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaMain {

    public static void main(String[] args) throws FileNotFoundException {

        String path="E:\\Java\\JavaPractice\\new.txt";

        File file=new File(path);
        Scanner scanner =new Scanner(file);

        while (scanner.hasNextLine()){
            String next = scanner.next();
            System.out.println(next);
        }
        scanner.close();
    }
}
