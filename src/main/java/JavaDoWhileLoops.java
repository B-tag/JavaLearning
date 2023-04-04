import java.util.Scanner;

public class JavaDoWhileLoops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter something : ");
        String text = scanner.nextLine();

        System.out.println("------------------------------------------");
        System.out.println("You have entered : " + text);

        int lengthOf = text.length();
        System.out.println("The length of your text is :" + lengthOf + "\n");

        int counter = 0;

        do {
            System.out.println("The character " + (counter + 1) + " is :" + text.charAt(counter));
            counter++;
        } while (counter < lengthOf);


    }
}
