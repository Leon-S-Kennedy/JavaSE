package about_reflect.class_object;

public class Test01 {
    public static void main(String[] args) {
        Class c=null;
        try {

            //通过反射机制获取Class，然后实例化对象

            c=Class.forName("about_reflect.get_class.User");

            //这个方法调用的是无参构造方法，必须保证无参构造是存在的
            Object o = c.newInstance();
            System.out.println(o);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}
