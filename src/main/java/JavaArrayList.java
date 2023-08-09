import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(88);
        myArrayList.add(144);
        myArrayList.add(256);
        myArrayList.add(23);
        myArrayList.add(144);


        System.out.println("The original Arraylist :");
        showArrayList(myArrayList);
        System.out.println("************************");

        System.out.println("Add element at index 3 to Arraylist :");
        // add a member between 2 and 3 then the length grow +1 (move to right)
        myArrayList.add(3, 21);
        // change the value of member in index 2
//        myArrayList.set(2,45);

        showArrayList(myArrayList);

        System.out.println("************************");
        myArrayList.remove(0);
        System.out.println("remove element at index 0 in Arraylist :");
        showArrayList(myArrayList);

        System.out.println("************************");
        System.out.println("Sorted Arraylist :");
        Collections.sort(myArrayList);
        showArrayList(myArrayList);

    }

    private static void showArrayList(ArrayList<Integer> myArrayList) {
        int i = 0;

        for (int list : myArrayList) {
            System.out.print("myArraylist members value :" + list);
            System.out.println(" --- index is : " + (i));
            i++;
        }
    }


}
