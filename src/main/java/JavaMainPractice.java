public class JavaMainPractice {
    public static void main(String[] args) {
        String text1="";
        String text2=null;
        String text3="0 ";

        int test1;
        int test2;
        int test3;



// null or space ... can not parse to int
//        test1=Integer.parseInt(text1);
//        test2=Integer.parseInt(text2);
        test3=Integer.parseInt(text3); // int must initialize first - it can not show

//        System.out.println(test1);
//        System.out.println(test2);
        System.out.println(test3); // space can not parse into int

    }
}
