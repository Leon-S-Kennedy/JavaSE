package about_thread.run_start_3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个 未来任务类 对象,其参数为一个Callable接口类实现对象
        FutureTask task=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                //call方法相当于run方法，不过有返回值
                System.out.println("开始");
                Thread.sleep(1000*10);
                System.out.println("结束");
                return 10+20;
            }
        });

        //创建线程对象
        Thread t=new Thread(task);
        //开启线程
        t.start();
        //在主线程中获取分支线程的一个返回值
        System.out.println(task.get());

        //注意,main方法的执行，需要等待get()获取返回值，再执行，也就是说get()方法会【阻塞】main方法（当前方法）的执行

        System.out.println("我被阻塞了");

    }
}
