package about_thread.about_threadsafe.SafeBank;

public class Account {
    private String actno;
    private double balance;
    public Account(){

    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdrow(double money){
        /*
        * 也就是说，以下方法应该是线程排队的
        *我们可以用一个线程同步机制  synchronized(){}
        *小括号中传入想让哪些线程同步，就传入需要同步的线程的  共享对象
        * 大括号中是线程同步代码块
        * */
        synchronized (this){
            double befor=getBalance();
            double after=befor-money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBalance(after);
        }
    }
}
