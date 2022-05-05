package about_reflect.about_field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test {
    public static void main(String[] args) throws Exception {
        Class studentClass=Class.forName("about_reflect.about_field.Student");

        //获取类中所有的 public属性
        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);
        Field f=fields[0];
        String fieldName=f.getName();
        System.out.println(fieldName);

        System.out.println("=============================");
        //获取类中 所有的属性
        Field[] fs = studentClass.getDeclaredFields();

        String name = studentClass.getName();                       //获取类的全名
        System.out.println("类的全名"+name);

        String simpleName = studentClass.getSimpleName();       //获取简类名
        System.out.println("类的简名"+simpleName);

        System.out.println(fs.length);
        System.out.println("=============================");
        for (Field field : fs) {

            int modifiers = field.getModifiers();        //获取修饰符
            String s = Modifier.toString(modifiers);
            System.out.println(s);

            Class type = field.getType();                //获取属性的类型
            System.out.println(type.getSimpleName());
            //System.out.println(field.getType());

            System.out.println(field.getName());    //获取属性的名字
            System.out.println("===============");
        }


    }
}
