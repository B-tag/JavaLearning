package JavaEmun;

import java.util.Scanner;

public class JavaMain {
    public static void main(String[] args) {

        JavaEnum color01 = JavaEnum.BLUE;
        JavaEnum color02 = JavaEnum.RED;
        JavaEnum color03 = JavaEnum.GREEN;

        System.out.println("----------------------");
        Scanner myInput = new Scanner(System.in);
        System.out.println("Input a color: ");
        String inputColor = myInput.nextLine();
        System.out.println("the input color is: " + inputColor.toUpperCase());

        JavaEnum tempColor = JavaEnum.valueOf(inputColor.toUpperCase());
        System.out.println("Temp color is: " + tempColor);

        showTheColor(tempColor);

        System.out.println("----------------------");

        showTheColor(color01);
        showTheColor(color02);
        showTheColor(color03);

        System.out.println(color01);
        System.out.println(color02);
        System.out.println(color03);

        JavaEnum color04 = JavaEnum.valueOf("RED");
        System.out.println(color04);

    }


    private static void showTheColor(JavaEnum tempColor) {
        switch (tempColor) {
            case RED:
                System.out.println("The Color is RED");
                break;
            case BLUE:
                System.out.println("The Color is BLUE");
                break;
            case GREEN:
                System.out.println("The color is GREEN");
                break;
            default:
                System.out.println("No color has selected");
                break;
        }
    }


}
