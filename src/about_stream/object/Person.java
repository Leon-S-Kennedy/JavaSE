package about_stream.object;

import java.io.Serializable;

public class Person implements Serializable {
    //serializable是一个标志性接口，里面没有东西。是给jvm看的，会自动生成一个序列化版本号
    //序列化版本号是用来区分类的，（不同人写的同名的类。。。）
    //但是我们后续不能修改代码，会导致序列化版本号不一致，编译报错
    //凡是实现了该接口的类，我们不建议自动生成，建议手动写一个不会变的版本号
    public static final long serialVersionUID=937854328L;

    public int id;
    public String name;

    public Person(){

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
