package about_reflect.about_constructor;

import java.lang.reflect.Constructor;

public class Test {
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("about_reflect.about_constructor.Vip");

        //调用无参构造方法
        Object o = aClass.newInstance();

        //getDeclaredConstructor  调用有参构造方法
        Constructor constructor = aClass.getDeclaredConstructor(int.class,String.class,String.class,boolean.class);

        //newInstance 方法调用有参构造方法
        Object o1 = constructor.newInstance(110, "123", "123", true);
        System.out.println(o1);

    }
}
