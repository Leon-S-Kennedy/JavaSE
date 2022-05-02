package about_thread.about_threadsafe.bank;

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
        //取款前
        double befor=getBalance();
        //取款后
        double after=befor-money;
        //此处模拟网络延迟，这里还没有更新余额，然后下一个就将钱取走了，于是会出现问题
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //更新余额
        setBalance(after);
    }
}
