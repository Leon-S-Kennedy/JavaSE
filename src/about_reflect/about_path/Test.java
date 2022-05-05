package about_reflect.about_path;

import java.io.FileInputStream;

public class Test {
    public static void main(String[] args) {
        //
        // FileInputStream fileInputStream = new FileInputStream("文件的路径（可能是相对ideaProject的相对路径，也可以是绝对路径）");
        //该方法的缺点在于，假设离开了idea我们的这个路径可能会失效

        /**
         * 以下方法只针对类路径下的文件（src路径文件下的）
         * Thread.currentThread()获取了当前线程对象
         * getContextClassLoader()可以获得当前线程的类加载器对象
         * getResource("") 类加载器的方法，默认从类的根路径下加载资源
         *
         * 资源一定从根路径下开始，也就是src下
         */
        String path=Thread.currentThread().getContextClassLoader().getResource("z.properties").getPath();
        System.out.println(path);

    }
}
