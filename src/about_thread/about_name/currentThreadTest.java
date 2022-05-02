package about_thread.about_name;

public class currentThreadTest {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        MyThread t1 = new MyThread();
        t1.setName("t1");
        t1.start();
        MyThread t2 = new MyThread();
        t2.setName("t2");
        t2.start();




    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            String name=Thread.currentThread().getName();
            System.out.println(name+"->"+i);
        }
    }
}
