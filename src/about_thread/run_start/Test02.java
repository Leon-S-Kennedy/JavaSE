package about_thread.run_start;

public class Test02 implements Runnable{
    //此种方法比较常用，因为可以继承其他类比较灵活
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程->"+i);
        }
    }

    public static void main(String[] args) {
        Thread t=new Thread(new Test02());
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程->"+i);
        }
    }
}
