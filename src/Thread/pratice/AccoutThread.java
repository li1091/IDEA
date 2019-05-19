package Thread.pratice;

public class AccoutThread implements Runnable {
    private Account ac=new Account();

    @Override
    public void run() {
        synchronized (this){
            if (ac.getbalance()>=400){
                ac.getmoney(300);
                System.out.println(Thread.currentThread().getName()+"在取款，取款后余额为："+ac.getbalance());
            }else {
                System.out.println(Thread.currentThread().getName()+"在取款,但余额不足400，取款失败");
            }
        }
    }
}
