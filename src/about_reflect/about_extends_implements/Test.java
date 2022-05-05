package about_reflect.about_extends_implements;

public class Test {
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("java.lang.String");


        System.out.println("获取其父类");
        Class superclass = aClass.getSuperclass();
        System.out.println(superclass.getName());

        System.out.println("获取其实现的接口");
        Class[] interfaces = aClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }
}
