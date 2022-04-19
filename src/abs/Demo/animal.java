package abs.Demo;

public abstract class animal {
    public String name;

    public abstract void setName(String name);

    public void bark(){
        System.out.println("吼叫");
    }
}
