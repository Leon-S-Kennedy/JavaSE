package about_thread.about_threadsafe.BankSafe;

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

    /*
    * synchronized出现在实例方法上，一定锁的的是this.
    * 这种方法有可能扩大同步的范围，导致效率不高
    *所以这种方法不灵活不是很推荐
    * */

    /*
    * StringBuffer是synchronized的，所以是线程安全的。StringBuilder是线程不安全的
    * Vector是线程安全的，ArrayList是线程不安全的
    * HashTable是线程安全的，HashSet和HashMap是线程不安全的
    * */
    public synchronized void withdrow(double money){
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
