package JavaClass;

import JavaClass.PackageOnePublic.PublicClass;
import JavaClass.PackageThreePublicProtectedMemeber.PublicClassProtectedFields;

public class MainPublicClass extends PublicClassProtectedFields {

    public static void main(String[] args) {

        // Same Package with default Access modifier
        ClassOfSamePackage classOfSamePackage = new ClassOfSamePackage();
        classOfSamePackage.age = 10;
        classOfSamePackage.name = "Test";

        // different package with public Access modifier
        PublicClass packageOne = new PublicClass();


        // different package with default Access modifier
        //No Access : ClassOfPackageTwo packageTwo=new ClassOfPackageTwo();

        // different package with Protected members Access modifier
        MainPublicClass packageThree = (MainPublicClass) new PublicClassProtectedFields();
        packageThree.age = 45;
        packageThree.name = "TESTER";

        // or
        MainPublicClass mainClassPackageThree = new MainPublicClass();
        mainClassPackageThree.age = 48;
        mainClassPackageThree.name = "Lenovo";


    }
}
