package about_thread.about_sleep;

public class InterruptTest {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

        t.interrupt();

    }
}
class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始");

        try {
            Thread.sleep(1000*60*60*24*365);    //先睡个一年
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"结束");
    }
}