package JavaEmun;

import java.awt.*;

public class JavaMain {
    public static void main(String[] args) {

        JavaEnum color01 = JavaEnum.BLUE;
        JavaEnum color02 = JavaEnum.ReD;
        JavaEnum color03 = JavaEnum.Green;

        showTheColor(color01);
        showTheColor(color02);
        showTheColor(color03);

        System.out.println(color01);
        System.out.println(color02);
        System.out.println(color03);

        JavaEnum color04 = JavaEnum.valueOf("ReD");
        System.out.println(color04);

    }


    private static void showTheColor(JavaEnum tempColor) {
        switch (tempColor) {
            case ReD:
                System.out.println("The Color is ReD");
                break;
            case BLUE:
                System.out.println("The Color is BLUE");
                break;
            case Green:
                System.out.println("The color is Green");
                break;
            default:
                System.out.println("No color has selected");
                break;
        }
    }


}
