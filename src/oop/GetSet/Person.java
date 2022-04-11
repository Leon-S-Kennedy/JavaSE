package oop.GetSet;

public class Person {
    private String name;
    public String getName() {
        return name;
    }

    private String sex;
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex!="男"||sex!="男"||sex!="未知"){
            throw new RuntimeException("请输入“男”或“女”或“未知”！！！");
        }
        this.sex = sex;
    }

    private boolean alive;
    public boolean isAlive() {
        return alive;
    }
}
