package about_reflect.about_path;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class Test01 {
    public static void main1(String[] args) throws Exception {
        //这是我们获取路径的方法

        String path = Thread.currentThread().getContextClassLoader()
                .getResource("z.properties").getPath();

        /*
        * 这是我们以前根据路径读配置文件的方法
        * */
        FileReader fileReader = new FileReader(path);
        Properties properties = new Properties();
        properties.load(fileReader);
        fileReader.close();

        String className = properties.getProperty("className");
        //System.out.println(className);

        //通过反射机制来新建一个对象
        Object o = Class.forName(className).newInstance();
        System.out.println(o);
    }

    public static void main(String[] args) throws Exception {
/*
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("z.properties").getPath();

        */
/*
         * 这是我们以前根据路径读配置文件的方法
         * *//*

        FileReader fileReader = new FileReader(path);
*/

        InputStream resourceAsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("z.properties");
        //不用管路径，直接使用流来读取

        Properties properties = new Properties();
        properties.load(resourceAsStream);
        resourceAsStream.close();

        String className = properties.getProperty("className");
        //System.out.println(className);

        //通过反射机制来新建一个对象
        Object o = Class.forName(className).newInstance();
        System.out.println(o);

    }
}
