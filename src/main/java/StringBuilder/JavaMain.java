package StringBuilder;

public class JavaMain {
    public static void main(String[] args) {
        String name01 = "Hello";

        name01 += ", My ";
        name01 += "name is ";
        name01 += "Tester 01";

        System.out.println(name01); // sys out 01


        StringBuilder name02 = new StringBuilder();

        name02.append("My name");
        name02.append(" is tester");
        name02.append("0" + 2);

        System.out.println("--------------------------------------------------");
        System.out.println("After all appending the Length is : " + name02.length());
        System.out.println(name02); // sys out 02 = My name is tester02

        System.out.println("--------------------------------------------------");
        name02.deleteCharAt(5); // Delete m
        System.out.println("After Delete the Length is : " + name02.length());
        System.out.println(name02); // sys out 03 = My nae is tester02

        System.out.println("--------------------------------------------------");
        name02.insert(5, "---"); // add "---" from index 5 then increase the length
        System.out.println("After insertion the Length is : " + name02.length());
        System.out.println(name02); // sys out 04 = My na---e is tester02


    }
}
