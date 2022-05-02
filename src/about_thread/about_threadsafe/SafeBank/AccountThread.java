package about_thread.about_threadsafe.SafeBank;

public class AccountThread extends Thread{
    //两个账户必须共享同一个账户对象
    private Account account;

    public AccountThread(Account ac){
        this.account= ac;
    }

    @Override
    public void run() {
        double money=50000;
        account.withdrow(money);
        System.out.println(Thread.currentThread().getName()+"对"+account.getActno()+"账户取款成功,剩余"+account.getBalance());
    }
}
