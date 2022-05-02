package about_thread.about_sleep;

public class SleepTest01 {
    //静态方法，参数是毫秒
    //作用是让当前线程进入休眠，进入“阻塞”状态
    //此时放弃占用cpu时间片，让给其他线程使用
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName()+"->"+i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
