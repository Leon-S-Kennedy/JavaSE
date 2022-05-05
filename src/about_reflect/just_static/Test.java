package about_reflect.just_static;

public class Test {
    /*
    * 就是说，如果我们只想执行方法的静态代码块，我们只需要Class.forName()方法
    * Class.forName()方法会加载类
    * */

    public static void main(String[] args) {
        try {
            Class.forName("about_reflect.just_static.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class MyClass{
    static {
        System.out.println("我是一个孤独的静态代码块");
    }
}