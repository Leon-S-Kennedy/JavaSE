package InheritancePolymorphism.demo4;

public class Use {
    static {
        System.out.println("7");
    }
    {
        System.out.println("8");
    }

    public static void main(String[] args) {
        System.out.println("9");
        new B.D();
        System.out.println("10");
        new B.D();
        System.out.println("11");
    }
}
