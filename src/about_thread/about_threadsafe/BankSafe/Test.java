package about_thread.about_threadsafe.BankSafe;

public class Test {
    public static void main(String[] args) {
        Account account = new Account("account1", 100000);

        Thread a1 = new AccountThread(account);
        Thread a2 = new AccountThread(account);
        //这两不是同一个对象，但是它们的共享同一个属性，因为实例属性是一个对象，分配在堆上，堆只有一个

        a1.setName("t1");
        a2.setName("t2");
        a1.start();
        a2.start();

    }
}
