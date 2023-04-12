package TernaryOperation;

public class JavaMain {

    public static void main(String[] args) {

        int age = 25;
        int MaxAge;

        MaxAge = age > 20 ? age : 20;

        int maxValue = Integer.MAX_VALUE;
        int min = maxValue;
        int minValue = Integer.MIN_VALUE;
        int max = minValue;

        int[] numbers = {2, 45, 145, 1, 0, 88, -25};

        // find min number loop
        for (int num : numbers) {
            min = num > min ? min : num;
        }
        System.out.println("The min number is : " + min);

        // find max number loop
        for (int num : numbers) {
            max = num < max ? max : num;
        }
        System.out.println("The MAX number is  :" + max);

    }
}

