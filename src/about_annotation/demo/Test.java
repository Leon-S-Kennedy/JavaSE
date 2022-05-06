package about_annotation.demo;

import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("about_annotation.demo.User");
        if(aClass.isAnnotationPresent(MustHasInt.class)){
            Field[] declaredFields = aClass.getDeclaredFields();
            boolean flag=false;
            for (Field field : declaredFields) {
                if(field.getName().equals("id")&&"int".equals(field.getType().getSimpleName())){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                throw new HasNotIntExeception("没有指定的int类型的id属性！！！");
            }
        }
    }
}
