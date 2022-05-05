package about_reflect.about_field;

import java.lang.reflect.Field;

public class GetOrSet {
    public static void main(String[] args) throws Exception {

        //反射出student对象
        Class c=Class.forName("about_reflect.about_field.Student");
        Object o = c.newInstance();

        //反射出属性
        Field no = c.getDeclaredField("no");

        //给对象的属性赋值
        no.set(o,421081);

        /**
         * 反射机制虽然让代码变得复杂，但是使代码变得更加灵活
         */


        //读取对象中的属性的值
        System.out.println(no.get(o));

        //可否访问私有的属性？
        Field name=c.getDeclaredField("name");
        //System.out.println(name.get(o));      显然不能直接访问

        name.setAccessible(true);   //但是我们可以通过这样的方式（打破封装）强制访问。缺点是，可能会给不法分子留下机会

        name.set(o,"lbw");
        System.out.println(name.get(o));
    }
}
