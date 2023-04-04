import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

        myLinkedList.add(25);
        myLinkedList.add(255);
        myLinkedList.add(875);
        myLinkedList.add(5625);
        myLinkedList.add(229);
        myLinkedList.add(5);
        myLinkedList.add(14);

        // Add item to linked list
        myLinkedList.add(5,21);

        // change the value of list item
        myLinkedList.set(1,44444);

        int i=0;

        for (Integer myLinked:myLinkedList) {
            System.out.print("My linked list items value : " + myLinked);
            System.out.println(" --- index is : "+i);
            i++;
        }


    }
}
