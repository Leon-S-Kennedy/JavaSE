package about_thread.wait_notify;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //创建公共的仓库
        List list=new ArrayList();
        //创建两个线程
        Thread t1=new Thread(new Producer(list));
        Thread t2=new Thread(new Consumer(list));
        //开启线程
        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}
class Producer implements Runnable{
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        //一直生产
        while(true){
            synchronized (list){        //给t1和t2的共享对象加锁
                if(list.size()>0){      //说明仓库有1个元素
                    try {
                        list.wait();    //当前线程t1进入等待状态，并且解除list的对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这里，说明仓库是空的可以进行生产
                Object o=new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName()+"添加->"+o);
                //此时需要唤醒消费者进行消费
                list.notify();
            }
        }
    }
}
class Consumer implements Runnable{
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            synchronized (list){        //给t1和t2的共享对象加锁
                if(list.size()==0){      //说明仓库没有元素
                    try {
                        list.wait();    //当前线程t2进入等待状态，并且解除list的对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序执行到这里，说明仓库不是空的可以进行消费
                Object o = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"删除->"+o);
                //此时需要唤醒生产者进行生产
                list.notify();
            }
        }
    }
}