package about_reflect.get_class;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        //Class.forName()方法

        //该方法是一个静态方法，得到的是一个字节码类对象
        //参数为一个完整的字符串，必须是完整的类名（带包名）
        Class c=null;
        try {
            c=Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //object的getClass（）方法

        //得到对象的类型的字节码类对象
        String s="abc";
        Class c1=s.getClass();
        System.out.println(c==c1);          //相等的原因是因为都指向方法区中的字节码文件，（方法区只有一个）

        //java中任何一种类型，都有class属性
        Class c2=String.class;
        Class c3=int.class;
        Class c4=double.class;
        Class c5= Arrays.class;

        System.out.println(c2==c1);
    }
}
