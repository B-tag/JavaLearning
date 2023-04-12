package StringBuilder;

public class JavaMain {
    public static void main(String[] args) {
        String name01="Hello";

        name01+= ", My ";
        name01+="name is ";
        name01+="Tester 01";

        System.out.println(name01);


        StringBuilder name02=new StringBuilder();

        name02.append("My name");
        name02.append(" is tester");
        name02.append("0"+2);
        System.out.println(name02);

        name02.deleteCharAt(5);
        System.out.println(name02);

        name02.insert(5,"---");
        System.out.println(name02);



    }
}
