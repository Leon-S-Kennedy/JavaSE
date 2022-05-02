package about_thread.about_threadsafe.exam2;

//doother方法执行需要等待dosome结束么？
//需要  因为需要获取对象锁，但是锁在t1那里，只能等t1结束了再执行
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
    public synchronized void doSome(){
        System.out.println("doSome方法开始");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("doSome方法结束");
    }
    public synchronized void doOther(){
        System.out.println("doOther方法开始");
        System.out.println("doOther方法结束");
    }
}