package Exception.demo3;

public class Demo {

    private static void testMethod(){

        System.out.println("testMethod");

    }

    public static void main(String[] args) {

        System.out.println(null instanceof Demo);

        ((Demo)null).testMethod();

    }

}