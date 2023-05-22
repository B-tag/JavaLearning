import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(); // No Null key multiple null value - print in inserted value order
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(); // one Null key multiple null value - in key order
        HashMap<Integer, String> myHashMap = new HashMap<>(); // one Null key multiple null value - not in order

        treeMap.put(1, "ABC-01");
        treeMap.put(2, "ABC-02");
        treeMap.put(3, "ABC-03");
        treeMap.put(77, "ABC-04");
        treeMap.put(123, "ABC-05");
        treeMap.put(8, "ABC-07");
        treeMap.put(11, "ABC-06");
        System.out.println("MY TreeMap       : " + treeMap); // in key order

        linkedHashMap.put(1, "ABC-01");
        linkedHashMap.put(2, "ABC-02");
        linkedHashMap.put(3, "ABC-03");
        linkedHashMap.put(77, "ABC-04");
        linkedHashMap.put(123, "ABC-05");
        linkedHashMap.put(8, "ABC-07");
        linkedHashMap.put(11, "ABC-06");
        System.out.println("MY LinkedHashMap : " + linkedHashMap); //

        myHashMap.put(1, "ABC-01");
        myHashMap.put(2, "ABC-02");
        myHashMap.put(3, "ABC-03");
        myHashMap.put(77, "ABC-04");
        myHashMap.put(123, "ABC-05");
        myHashMap.put(8, "ABC-07");
        myHashMap.put(11, "ABC-06");
        System.out.println("MY HashMap       : " + myHashMap);

        extracted(treeMap, "Tree");
        System.out.println();
        extracted(linkedHashMap, "Linked Hash");
        System.out.println();
        extracted(myHashMap, "My Hash");

    }

    private static void extracted(Map<Integer, String> myMap, String typeOfMap) {
        System.out.println("---- Type of Map : " + typeOfMap + " ----");
        for (Integer number : myMap.keySet()) {
            System.out.print("Key :" + number);
            System.out.println("  --- Value :" + myMap.get(number));
        }
    }
}
