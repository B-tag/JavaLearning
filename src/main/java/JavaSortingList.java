import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSortingList {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        strings.add("Blue");
        strings.add("Green");
        strings.add("Gold");
        strings.add("silver");
        strings.add("red");
        strings.add("Blue");
        strings.add("Red");

        numbers.add(123);
        numbers.add(-25);
        numbers.add(14);
        numbers.add(1);
        numbers.add(001);
        numbers.add(14);
        numbers.add(36);

        Collections.sort(strings);
        Collections.sort(numbers);

        extracted(strings);
        System.out.println();
        extracted(numbers);

        Collections.reverse(strings);
        Collections.reverse(numbers);

        extracted(strings);
        System.out.println();
        extracted(numbers);

    }
    private static void extracted(ArrayList<Integer> numbers) {
        for (Integer value: numbers){
            System.out.println("List of numbers :"+value);
        }
        System.out.println();
    }


    private static void extracted(List<String> strings) {
        for (String value: strings){
            System.out.println("List of string :"+value);
        }
        System.out.println();
    }
}
