public class JavaIfStatement {
    public static void main(String[] args) {

        boolean bool01 = 2 > 3;
        boolean bool02 = 2 == 3;
        boolean bool03 = 2 < 3;

        System.out.println("Bool 01 = " + bool01);
        System.out.println("Bool 02 = " + bool02);
        System.out.println("Bool 03 = " + bool03);

        int value01=23;
        int value02=27;

        if (value01 < value02) {
            System.out.println("IF Statement == ");
        } else if (value01 > value02) {
            System.out.println("ELSE-IF Statement == ");
        } else System.out.println("Else Statement == ");



    }
}
