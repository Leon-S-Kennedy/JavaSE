package about_reflect.get_class;

import java.io.FileReader;
import java.util.Properties;

/*
    验证反射机制的灵活性
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        //通过ioStream读取属性配置文件
        FileReader fileReader = new FileReader("src/about_stream/io_properties/userinfo.properties");
        //创建属性类对象map
        Properties properties = new Properties();
        //加载
        properties.load(fileReader);
        //关闭流
        fileReader.close();
        //获取 “username” 键的值
        String className=properties.getProperty("username");
        //System.out.println(className);

        //通过反射机制实例化对象
        Class c=Class.forName(className);
        Object o = c.newInstance();
        /*
        * 也就是说，我们可以通过配置文件，在不改变源代码的基础上，可以做到不同对象的实例化，非常灵活。
        *只需要修改配置文件
        * */
    }
}
