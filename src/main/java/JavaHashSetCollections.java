import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaHashSetCollections {

    public static void main(String[] args) {

        Set<Integer> myHashSet = new HashSet<>();
//      or   HashSet<Integer> myHashSet = new HashSet<>();
        LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet<>();
        TreeSet<String> myTreeSet = new TreeSet<>();

        myHashSet.add(101);
        myHashSet.add(202);
        myHashSet.add(404);
        myHashSet.add(303);
        myHashSet.add(505);
        myHashSet.add(606);
        myHashSet.add(707);
        myHashSet.add(606); // Duplication not added

        for (int counter : myHashSet) {
            System.out.printf(String.valueOf(counter + ",")); // not store in order when we try to retrieve
        }
        System.out.println();

        System.out.println("My Hash Set        : " + myHashSet); // Println is in order

        myLinkedHashSet.add("ABC-02");
        myLinkedHashSet.add("ABC-01");
        myLinkedHashSet.add("ABC-03");
        myLinkedHashSet.add("ABC-04");
        myLinkedHashSet.add("ABC-06");
        myLinkedHashSet.add("ABC-05");
        myLinkedHashSet.add("ABC-07");
        myLinkedHashSet.add("ABC-06"); // Duplication not added

        System.out.println("My Linked Hash Set : " + myLinkedHashSet); // print as we added

        myTreeSet.add("A-01");
        myTreeSet.add("B-02");
        myTreeSet.add("F-06");
        myTreeSet.add("D-04");
        myTreeSet.add("C-03");
        myTreeSet.add("E-05");
        myTreeSet.add("G-07");
        myTreeSet.add("F-06"); // Duplication not added

        System.out.println("My Tree Hash Set   : " + myTreeSet); // Print in order

    }
}
