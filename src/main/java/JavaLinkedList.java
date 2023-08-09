import java.util.Collections;
import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

        myLinkedList.add(25);
        myLinkedList.add(255);
        myLinkedList.add(875);
        myLinkedList.add(5625);
        myLinkedList.add(229);


        System.out.println("************* Original Linked list *****************");
        System.out.println(myLinkedList.toString());
        showLinkedList(myLinkedList);

        System.out.println("*************** Add 21 to index 5 *******************");
        // Add item to linked list - add to the list - we can add in range of:  "first_index (0) <-to-> last_index +1"
        myLinkedList.add(5, 21);
        System.out.println(myLinkedList.toString());
        showLinkedList(myLinkedList);

        System.out.println("*************** Add 4444 to index 1 (Replace) *******************");
        // change the value of list item - replace
        myLinkedList.set(1, 44444);
        System.out.println(myLinkedList.toString());
        showLinkedList(myLinkedList);

        System.out.println("*************** Remove element at index 3 *******************");
        // Remove an item
        myLinkedList.remove(3);
        System.out.println(myLinkedList.toString());
        showLinkedList(myLinkedList);

        System.out.println("*************** Show sorted linked list *******************");
        // Sort the linked list
        Collections.sort(myLinkedList);
        showLinkedList(myLinkedList);


    }

    private static void showLinkedList(LinkedList<Integer> myLinkedList) {
        int i = 0;
        for (Integer myLinked : myLinkedList) {
            System.out.print("My linked list items value : " + myLinked);
            System.out.println(" --- index is : " + i);
            i++;
        }
    }
}
