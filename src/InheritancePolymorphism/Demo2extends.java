package InheritancePolymorphism;

import InheritancePolymorphism.demo2.Base;

public class Demo2extends extends Base {
    public void method(){
/*
        this.a;
        this.b;
        //以下的两个属性可以看见
        this.c;
        this.d;
*/
    }
    //由于静态方法是当成父类在用，不是一个字类存在。所以
    public static void main(String[] args) {
        Base b = new Base();

    }
}
