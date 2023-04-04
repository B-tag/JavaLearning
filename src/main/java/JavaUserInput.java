import java.util.Scanner;

public class JavaUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter something : ");
        String next = scanner.next();

        System.out.println("------------------------------------------");
        System.out.println("You have entered : " + next);
    }
}
