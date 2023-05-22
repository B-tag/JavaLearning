import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> myHashMap = new HashMap<>();

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
    }

    private static void extracted(HashMap<Integer, String> myMap) {
        for (Map.Entry<Integer, String> loopCounter : myMap.entrySet()) {
            System.out.print("Key :" + loopCounter.getKey());
            System.out.println("  --- Value :" + loopCounter.getValue());
        }
    }
}
