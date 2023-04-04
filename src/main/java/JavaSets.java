import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JavaSets {

    public static void main(String[] args) {

        HashSet<String> hashSet01 = new HashSet<>();
        TreeSet<String> treeSet01 = new TreeSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        hashSet01.add("Keyboard");
        hashSet01.add("CPU");
        hashSet01.add("RAM");
        hashSet01.add("RAM");
        hashSet01.add("Hard");

        treeSet01.add("Samsung");
        treeSet01.add("Apple");
        treeSet01.add("Microsoft");
        treeSet01.add("Apple");

        linkedHashSet.add("My Linked 01");
        linkedHashSet.add("My Linked 02");
        linkedHashSet.add("My Linked 02");
        linkedHashSet.add("My Linked 04");

        extracted(treeSet01); // print in natural order
        extracted(hashSet01); // not in  order
        extracted(linkedHashSet); //not in order

        System.out.println(treeSet01.size());
        System.out.println(linkedHashSet.size());
        System.out.println(hashSet01.size());

        System.out.println(treeSet01.removeAll(linkedHashSet));


    }

    private static void extracted(HashSet<String> treeSet01) {
        for (String value : treeSet01) {
            System.out.println("Tree set output :" + value);
        }
        System.out.println();
    }

    private static void extracted(TreeSet<String> treeSet01) {
        for (String value : treeSet01) {
            System.out.println("Tree set output :" + value);
        }
        System.out.println();
    }
}
