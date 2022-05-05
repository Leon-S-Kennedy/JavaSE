package about_reflect.about_method;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test01 {
    //通过反射机制调用对象的方法
    public static void main(String[] args) throws Exception {
        //获取类
        Class aClass = Class.forName("about_reflect.about_method.UserService");

        //反射出对象
        Object o = aClass.newInstance();

        //通过方法名和参数列表反射出方法
        Method login = aClass.getDeclaredMethod("login", String.class, String.class);

        //invoke方法来调用该方法。
        /**
         *      对象是o、方法是login、参数列表是“libowen”、“123456”、返回值是object
         */
        Object invoke = login.invoke(o, "libowen", "123456");
        System.out.println(invoke);
    }
}
