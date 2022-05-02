package about_thread.about_stop;

public class Test01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.setName("t");
        thread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.run=false;
    }
}
class MyThread implements Runnable{
    boolean run=true;   //用一个标记来判定执行
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if(run){
                System.out.println(Thread.currentThread().getName()+"->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //此处可以写一些保存的东西之类的
                //
                return;
            }
        }
    }
}