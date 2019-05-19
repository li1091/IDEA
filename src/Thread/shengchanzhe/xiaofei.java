package Thread.shengchanzhe;

public class xiaofei implements Runnable{
    private product p;

    public xiaofei(product p) {
        this.p = p;
    }


    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者消费，消费了："+p.getPinpai()+"----"+p.getName());
        }
    }
}
