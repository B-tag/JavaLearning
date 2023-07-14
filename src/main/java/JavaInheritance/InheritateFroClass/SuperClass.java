package JavaInheritance.InheritateFroClass;

public class SuperClass {

    public int age;
    public String name;

    public static void show(SuperClass superClass){
        System.out.println("Age is : "+superClass.age);
        System.out.println("Name is : "+superClass.name);
    }

    public void overRideMethod(){
        System.out.println("This is SuperClass Method");
    }
}
