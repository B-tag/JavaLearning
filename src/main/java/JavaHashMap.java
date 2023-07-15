import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

    public static void main(String[] args) {

        ArrayList<String> myArray = new ArrayList<>();
        String name = "tedf;kgjhrtsoasponbbbeeest";


        HashMap<Integer, String> myHashMap = new HashMap<>();
        HashMap<Integer, ArrayList<String>> otherHashMap = new HashMap<>();

        myHashMap.put(1, "ABC-01");
        myHashMap.put(2, "ABC-02");
        myHashMap.put(3, "ABC-03");
        myHashMap.put(77, "ABC-04");
        myHashMap.put(123, "ABC-05");
        myHashMap.put(11, "ABC-06");
        myHashMap.put(8, "ABC-07");

        System.out.println(myHashMap);

        extracted(myHashMap); // To show key value pairs

        myHashMap.put(11, "My Set"); // overwrite on key = 11
        myHashMap.put(152, "new Entry");

        System.out.println();
        extracted(myHashMap);

        myArray.add("test");
        myArray.add("stet");
        myArray.add("ttes");
        myArray.add("ttse");
        myArray.add("estt");
        myArray.add("sett");

        // sort a String in this one "name"
        name = name.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(name);

        otherHashMap.put(1, myArray);

        System.out.println(otherHashMap);


    }

    private static void extracted(HashMap<Integer, String> myMap) {
        for (Map.Entry<Integer, String> loopCounter : myMap.entrySet()) {
            System.out.print("Key :" + loopCounter.getKey());
            System.out.println("  --- Value :" + loopCounter.getValue());
        }
    }

    // other way to sort a string
    private static String sort(String text) {
        char[] chars = prepare(text).toCharArray();

        Arrays.sort(chars);
        return new String(chars);
    }
    private static String prepare(String text) {
        return text.toLowerCase()
                .trim()
                .replaceAll("\\s+", "");
    }

}
