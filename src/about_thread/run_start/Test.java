package about_thread.run_start;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        /*
        * start方法的作用是在JVM开辟一段新的栈空间然后就结束
        * 启动成功，run方法就会自动启动然后压在分支栈的栈底
        * */
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程->"+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("分支线程->"+i);
        }
    }
}

