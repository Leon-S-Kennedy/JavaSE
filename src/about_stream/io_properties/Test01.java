package about_stream.io_properties;

import java.io.FileInputStream;
import java.util.Properties;

public class Test01 {
    /*
    * 一个很好的设计理念，将经常需要变动的数据写道文件中，使用程序动态读取。
    *这种文件称为配置文件
    *
    * */
    public static void main(String[] args) throws Exception {
        //新建一个输入流对象
        FileInputStream fis=new FileInputStream("src/about_stream/io_properties/userinfo.properties");
        //新建一个properties对象
        Properties pro = new Properties();

        pro.load(fis);

        String username = pro.getProperty("username");
        System.out.println(username);

        String password = pro.getProperty("password");
        System.out.println(password);
    }
}
