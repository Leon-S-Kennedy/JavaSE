package learn;

import java.util.Comparator;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Object o=new Object() { };
        //定义一个匿名类对象，使用Object的无参构造方法，同时实例化了对象没有重写任何方法

        Random random= new Random(){
            @Override
            public int nextInt() {
                System.out.println("我在这个匿名类中");
                return super.nextInt();
            }
        };
        //System.out.println(random.nextInt());

        Comparator comparator=new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        //这两种方法是一样的
        Comparator comparator1=((o1, o2) -> 0);
    }
}
