package oop.attribute;

public class Order {
    public Order() {
        System.out.println("1");
    }

    {
        System.out.println("2");
    }

    int b = initB();

    private int initB() {
        System.out.println("3");
        return 1;
    }


    static {
        System.out.println("4");
    }

    static int a = initA();

    private static int initA() {
        System.out.println("5");
        return 2;
    }

    public static void main(String[] args) {
        System.out.println("6");
        Order order1 = new Order();
        System.out.println("7");
        Order order2 = new Order();
        System.out.println("8");
    }
}
