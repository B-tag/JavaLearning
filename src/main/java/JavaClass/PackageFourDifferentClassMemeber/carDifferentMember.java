package JavaClass.PackageFourDifferentClassMemeber;

public class carDifferentMember {

    PublicClassWithDifferentMember publicClassWithDifferentMember=new PublicClassWithDifferentMember();

    public void test(){
        publicClassWithDifferentMember.age01=21;
        publicClassWithDifferentMember.family="Testing";
        publicClassWithDifferentMember.name01="Test";
        publicClassWithDifferentMember.serialNumber=1234;
        // No access to private member 'name02','age02'
    }
}
