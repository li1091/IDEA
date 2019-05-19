package Thread;

public class buytrain02 implements Runnable{
    private int cont=10;

    @Override
    public void run() {
        for(int i=0;i<100 ;i++){
            if (cont>0){
                System.out.println("我在"+Thread.currentThread().getName()+"买到火车票"+"剩余"+(--cont));

            }
        }
    }
}

class demo{
    public static void main(String[] args){
        buytrain02 buy=new buytrain02();
        new Thread(buy,"窗口1").start();
        new Thread(buy,"窗口2").start();
        new Thread(buy,"窗口3").start();
    }
}


