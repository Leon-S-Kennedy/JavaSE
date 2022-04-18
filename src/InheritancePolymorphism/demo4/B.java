package InheritancePolymorphism.demo4;

public class B {
    public B(){
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    static {
        System.out.println("3");
    }
    static class D extends B{
         public D(){
             System.out.println("4");
         }
        {
            System.out.println("5");
        }
        static {
            System.out.println(6);
        }
    }
}
