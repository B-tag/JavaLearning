package JavaClass.PackageFourDifferentClassMemeber;

import JavaClass.JavaMainMemberPracticing;

public class OtherSameClass {

    public static void main(String[] args) {

        PublicClassWithDifferentMember object01=new JavaMainMemberPracticing();
        object01.name01="Reset";
        object01.age01=14;
        object01.serialNumber=4455;
        object01.family="Test Man";

        // No Access to private members (name 02 - age02)
    }
}
