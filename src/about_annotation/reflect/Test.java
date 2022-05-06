package about_annotation.reflect;

import about_annotation.MyAnnotation;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args) throws Exception{
        Class aClass = Class.forName("about_annotation.Test");

        //如果存在MyAnnotation注解就，返回该注解中的name的值
        if(aClass.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation annotation = (MyAnnotation) aClass.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.name());
        }

        //String中不含这个注解
        Class aClass1 = Class.forName("java.lang.String");
        System.out.println(aClass1.isAnnotationPresent(MyAnnotation.class));
    }
}
