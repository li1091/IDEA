package Thread;

public class buystrainTicket {
    public static void main(String[] args){
        trainstation t1=new trainstation("窗口1");
        trainstation t2=new trainstation("窗口2");
        trainstation t3=new trainstation("窗口3");
        t1.start();t2.start();t3.start();
        System.out.println("主线程结束");
    }
}

class trainstation extends Thread{
    static int piao=10;
    public trainstation(String name) {
        super(name);
    }

    @Override
    public void run() {
        qiangpiao();
    }

    private synchronized void qiangpiao(){
        for(int i=0;i<100 ;i++){
            if (piao>=0){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我在"+this.getName()+"买到了火车票"
                        +"  "+"剩余票数"+(piao--));
            }
        }
    }
}
