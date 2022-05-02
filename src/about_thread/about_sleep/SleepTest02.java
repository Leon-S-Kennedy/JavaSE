package about_thread.about_sleep;

public class SleepTest02 {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                }
            }
        });

        t.start();
        try {
            t.sleep(5000);              //此方法是静态方法，在执行的时候会转成Thread.sleep(5000);
                                            //  也就是说，主方法会休眠五秒。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("我是主线程");
    }
}
