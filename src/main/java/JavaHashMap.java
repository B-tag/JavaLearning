import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "ABC-01");
        myMap.put(2, "ABC-02");
        myMap.put(3, "ABC-03");
        myMap.put(77, "ABC-04");
        myMap.put(123, "ABC-05");
        myMap.put(11, "ABC-06");
        myMap.put(8, "ABC-07");

        System.out.println(myMap);

        extracted(myMap); // To show key value pairs

        myMap.put(11,"My Set"); // overwrite on key = 11
        myMap.put(152,"new Entry");

        System.out.println();
        System.out.println();
        System.out.println();
        extracted(myMap);


    }



    private static void extracted(HashMap<Integer, String> myMap) {
        for (Map.Entry<Integer, String> loopCounter: myMap.entrySet()){
            System.out.print("Key :"+loopCounter.getKey());
            System.out.println("  --- Value :"+loopCounter.getValue());
        }
    }
}
