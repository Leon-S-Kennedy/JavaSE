package oop;
public class Student {
    public String name="default";
    public int age=19;
    public String gender="♀";

    //构造方法，用于对象的实例化。
    public Student(){
        name="张三（default）";
        age=18;
        gender="♂（default）";
        System.out.println("我是一个孤独的无参构造方法");
    }
    public Student(String s,int a,String s1){
        name=s;
        age=a;
        gender=s1;
        System.out.println("我是一个String类型的构造方法");
    }

}