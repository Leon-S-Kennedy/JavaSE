package oop.method;

public class UsePerson {
    public static void main(String[] args) {
        Person p1 = new Person("飞行员A", 22);
        p1.intoduce();
        System.out.println("=========================");
        Person p2 = new Person("飞行员B", 23);
        p2.intoduce();
    }
}
