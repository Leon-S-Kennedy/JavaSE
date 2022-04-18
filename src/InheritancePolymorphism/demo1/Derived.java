package InheritancePolymorphism.demo1;

public class Derived extends Base {
/*
    public void printName2() {
        System.out.println(this.name);
    }
*/

    public static void main(String[] args) {
        Derived d = new Derived();
        d.printName();
    }
}
