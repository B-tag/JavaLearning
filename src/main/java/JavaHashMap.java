import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();
        String name = "tedf;kgjhrtsoasponbbbeeest";


        HashMap<Integer, String> myHashMap = new HashMap<>();
        HashMap<Integer, ArrayList<String>> otherHashMap = new HashMap<>();

        myHashMap.put(1, "ABC-01");
        myHashMap.put(2, "ABC-02");
        myHashMap.put(3, "ABC-03");
//        myHashMap.put(77, "ABC-04");
//        myHashMap.put(123, "ABC-05");
//        myHashMap.put(11, "ABC-06");
        myHashMap.put(8, "ABC-07");

        System.out.println("----------- Print myHashMap in Sout only ------------");
        System.out.println(myHashMap);
        System.out.println("----------- Print myHashMap in my method ------------");
        extracted(myHashMap); // To show key value pairs

        myHashMap.put(2, "**My Set**"); // overwrite on key = 11
        myHashMap.put(152, "****new Entry****");

        System.out.println();
        System.out.println("----------- Print myHashMap in my method (after changes)------------");
        extracted(myHashMap);

        myArrayList.add("test");
        myArrayList.add("stet");
        myArrayList.add("ttes");
        myArrayList.add("ttse");
        myArrayList.add("estt");
        myArrayList.add("sett");

        // sort a String in this one "name"
        name = name.chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println();
        System.out.println("------------ String name ' tedf;kgjhrtsoasponbbbeeest ' been sorted -----------");
        System.out.println(name);

        System.out.println();
        otherHashMap.put(1, myArrayList);
        System.out.println("-------- Print the otherHashMap before modification -------- ");
        System.out.println(otherHashMap);

        myArrayList.add(5,"Behrooz");
        myArrayList.add(0,"Behrooz");
        otherHashMap.put(2, myArrayList);

        System.out.println("---------- print otherHashMap After modification on my Array (Because it's reference it affects all map keys)----------");
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
