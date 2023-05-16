

public class JavaArray {

    public static void main(String[] args) {

        int number01 = 10;
        int[] numbers = {10, 15, 1, 84, 65};
//        numbers[5] = 25; out of bound numbers last index is 4, and it's not extendable // compiler error
//        System.out.printf("" + numbers[5]);  // compiler error in line 9

        System.out.println("The Integer variable is : " + number01);
        System.out.println("The Array (Integer) variable is : " + numbers); // address only
        System.out.println("The Array (Integer) variable is : " + numbers.toString()); // address only
        System.out.println("The Length of Array (Integer) is : " + numbers.length);

        for (int a : numbers) {
            System.out.println("The list of numbers :" + a);
        }

        String text01 = "Test";
        String[] text = {"Hello", "World", "My car", "25", "LooP&PooL", " 4 "};

        for (String textTemp : text) {
            System.out.println("The list of String Array:----" + textTemp + "----");
        }

    }
}
