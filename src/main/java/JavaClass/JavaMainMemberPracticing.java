package JavaClass;

import JavaClass.PackageFourDifferentClassMemeber.PublicClassWithDifferentMember;

public class JavaMainMemberPracticing extends PublicClassWithDifferentMember {

    public static void main(String[] args) {

        // Access to public members
        PublicClassWithDifferentMember PCMember=new PublicClassWithDifferentMember();
        PCMember.age01=10;
        PCMember.name01="Testing MAN";

        // Access to public and protected member
        JavaMainMemberPracticing object01= (JavaMainMemberPracticing) new PublicClassWithDifferentMember();
        object01.age01=15;
        object01.name01="My Testing";
        object01.serialNumber=123;

        // No access to default because they are not in the same package
        // To Access to the default member they must be in the same package
        //
        // No access to private


    }
}
