public class JavaNumericValue {

    public static void main(String[] args) {

        // casting
        byte a = 10;
        short b = 4561;
        int c = 1234567;
        double d = 4.1E2;
        float f = 35.254f;
        long l = 123456789111L;

        c = b;

        System.out.println("Value is : " + c);

        System.out.println("------------------------------");
        int a2 = 20;
        System.out.println("a2 value is : " + a2);
        Integer b2 = Integer.valueOf(a2);
        System.out.println("Converted Value of b is: " + b2);
        Integer b3 = a2;
        System.out.println("Value of b3 is : " + b3);
//        Integer c2 = new Integer(30); or Integer c2=30;
        Integer c2 = 30;
        int d2 = c2.intValue();
        System.out.println("Converted Value of d is: " + d2);

//        System.out.println("Byte max value : " + Byte.MAX_VALUE);
//        System.out.println("Byte min value : " + Byte.MIN_VALUE);
//        System.out.println("------------------------------------------");
//        System.out.println("Short Max Value : "+Short.MAX_VALUE);
//        System.out.println("Short Max Value : "+Short.MIN_VALUE);
//        System.out.println("------------------------------------------");
//        System.out.println("Integer Max value : "+Integer.MAX_VALUE);
//        System.out.println("Integer Min value : "+Integer.MIN_VALUE);
//        System.out.println("------------------------------------------");
//        System.out.println("Float Max value : " + Float.MAX_VALUE);
//        System.out.println("Float Min value : " + Float.MIN_VALUE);
//        System.out.println("------------------------------------------");
//        System.out.println("Double Max value : "+ Double.MAX_VALUE);
//        System.out.println("Double Min value : "+ Double.MIN_VALUE);
//        System.out.println("------------------------------------------");
//        System.out.println("Long Max Value : "+ Long.MAX_VALUE);
//        System.out.println("Long Min Value : "+ Long.MIN_VALUE);
//        System.out.println("------------------------------------------");

    }
}
