package about_thread.wait_notify.Print100;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //创建公共的仓库
        Num i=new Num(1);
        //创建两个线程
        Thread t1=new Thread(new Producer(i));
        Thread t2=new Thread(new Consumer(i));
        //开启线程
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}

class Producer implements Runnable{
    private Num i;

    public Producer(Num num) {
        this.i = num;
    }

    @Override
    public void run() {
        //一直生产
        while(i.i<100){
            synchronized (i){        //给t1和t2的共享对象加锁
                if(i.i%2==0){      //说明仓库有1个元素
                    try {
                        i.wait();    //当前线程t1进入等待状态，并且解除list的对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这里，说明仓库是空的可以进行生产
                System.out.println(Thread.currentThread().getName()+"->"+(i.i++));
                //此时需要唤醒消费者进行消费
                i.notify();
            }
        }
    }
}

class Consumer implements Runnable{
    private Num i;

    public Consumer(Num num) {
        this.i = num;
    }

    @Override
    public void run() {
        while(i.i<100){
            synchronized (i){        //给t1和t2的共享对象加锁
                if(i.i%2==1){      //说明仓库没有元素
                    try {
                        i.wait();    //当前线程t2进入等待状态，并且解除list的对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这里，说明仓库不是空的可以进行消费
                System.out.println(Thread.currentThread().getName()+"->"+(i.i++));
                //此时需要唤醒生产者进行生产
                i.notify();
            }
        }
    }
}
class Num{
    int i;
    public Num(int i) {
        this.i = i;
    }
}
class A{}