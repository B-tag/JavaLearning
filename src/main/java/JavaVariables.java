

public class JavaVariables {
    public static void main(String[] args) {


        int a01 = 214;
        int a02 = 213;
        short b = 55;
        long c = 8325;
        double d = 3.4567;
        float e = 5.235f;
        byte g = 127;
        int i = a01 + b;
//        System.out.println(i);
//        System.out.println("Numbers: " + a + d); // not add numbers shows string

        boolean bool01 = true;
        boolean bool02 = false;
        boolean bool03 = a01 < a02 ? bool01 : bool02;
        System.out.println(bool03);

        // compiler error
//        int test00= Integer.parseInt("value");
//        System.out.println(test00);
//

//        String text = "pool";
//        char chara = 'e';
//        System.out.println(a + text);

        String test = "TEST";
        Character test02 = 'e';
        System.out.println("Char test3 : " + test02);

        char test3 = '3';
        test02 = test3;

        System.out.println("Char test3 : " + test3);
        System.out.println("Char test3 : " + test02);

    }
}
