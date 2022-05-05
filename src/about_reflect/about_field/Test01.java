package about_reflect.about_field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test01 {
    //通过反射机制反编译出类的属性
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("java.lang.String");
        StringBuilder sb = new StringBuilder();
        //此处添加类的全名
        sb.append(Modifier.toString(aClass.getModifiers()) +" class " +aClass.getSimpleName()+" {\n");

        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers())+" ");
            sb.append(field.getType().getSimpleName()+" ");
            sb.append(field.getName()+";\n");
        }

        //添加最后的反括号
        sb.append("}");

        System.out.println(sb.toString());
    }
}
