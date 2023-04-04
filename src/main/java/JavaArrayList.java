import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(88);
        myArrayList.add(144);
        myArrayList.add(256);
        myArrayList.add(23);
        myArrayList.add(64);
        myArrayList.add(5);
        myArrayList.add(96);
        myArrayList.add(71);
        myArrayList.add(18);
        myArrayList.add(1119);
        myArrayList.add(210);

        // add a member between 10 and eleven then the length grow to 12
        myArrayList.add(10,21);

        // change the value of member in index 2
//        myArrayList.set(2,45);

        int i = 0;

        for (int list : myArrayList) {
            System.out.print("myArraylist members value :" + list);
            System.out.println("--- index is : " + (i) );
            i++;
        }

    }

}
