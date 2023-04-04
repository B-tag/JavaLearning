import java.util.Scanner;

public class JavaSwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter something : ");
        String text = scanner.nextLine();

        System.out.println("------------------------------------------");
        System.out.println("You have entered : " + text);

        int lengthOf = text.length();
        System.out.println("The length of your text is :" + lengthOf + "\n");

        String switchString = text.trim();
        System.out.println("The trimmed text is :" + switchString + "\n");

        switch (switchString.toLowerCase()) {

            case "hello":
                System.out.println("It's only Hello");
                break;
            case "world":
                System.out.println("you have world");
                break;
            default:
                System.out.println("--no world-- and --no Hello--");
                break;
        }

    }

}
