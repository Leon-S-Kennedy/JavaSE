package abs.Demo;

public class dog extends animal{
    @Override
    public void setName(String name) {
        this.name="小狗："+name;
    }

    @Override
    public void bark() {
        super.bark();
        System.out.println("汪汪");
    }
}
