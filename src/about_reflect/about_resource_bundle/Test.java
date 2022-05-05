package about_reflect.about_resource_bundle;

import java.util.ResourceBundle;

/**
 * java.util包下的资源绑定器，便于获取属性配置文件的内容
 * 只能绑定类路径下的文件（src）
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //好家伙，不用管路径，不用管properties以及传入的流，直接一句话搞定

        ResourceBundle bundle =ResourceBundle.getBundle("z");
        String className = bundle.getString("className");

        Object o = Class.forName(className).newInstance();
        System.out.println(className);
    }
}
