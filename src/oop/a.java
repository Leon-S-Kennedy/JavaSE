package oop;

public class a {
    public static void main(String[] args) {
        //对象的实例化。
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);

        System.out.println("==================================");

        Student student1 = new Student("李四",17,"♂");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gender);

    }
}
