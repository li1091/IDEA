package Thread.shengchanzhe;

public class shengchan implements Runnable{
    private product p;

    public shengchan(product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for(int i=0;i<10 ;i++){
           if (i%2==0){
               try {
                   p.setproduct("费列罗","巧克力");
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }else {
               try {
                   p.setproduct("哈尔滨","啤酒");
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }
}
