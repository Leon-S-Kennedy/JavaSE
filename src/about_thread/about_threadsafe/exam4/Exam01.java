package about_thread.about_threadsafe.exam4;

//doother方法执行需要等待dosome结束么？
//synchronized出现在静态方法上，所以找的是【类锁】，然而无论多少对象，【类锁】只有一把，所以会等待
public class Exam01 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        Thread t1=new MyThread(myClass);
        Thread t2=new MyThread(myClass);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}

class MyThread extends Thread{
    private MyClass mc;
    public MyThread(MyClass myClass){
        this.mc=myClass;
    }

    @Override
    public void run() {
        //
        if(Thread.currentThread().getName().equals("t1")){
            mc.doSome();
        }
        if(Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}

class MyClass{
    public synchronized static void doSome(){
        System.out.println("doSome方法开始");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("doSome方法结束");
    }
    public synchronized static void doOther(){
        System.out.println("doOther方法开始");
        System.out.println("doOther方法结束");
    }
}