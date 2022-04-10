package oop.method;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void intoduce(){
        System.out.printf("我叫 %s 今年 %d 岁\n",this.name,age);
    }
}
