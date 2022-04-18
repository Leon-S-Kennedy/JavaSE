package InheritancePolymorphism.demo3;

public class Derived extends Base {
    //由于父类之中没有无参构造方法，子类不会隐式调用父类的无参构造方法，所以子类的构造方法中需要主动调用父类的构造方法。
    public Derived(int a) {
        super(a);
    }
}
