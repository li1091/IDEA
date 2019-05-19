package Thread.shengchan02;

public class produce implements Runnable {
    private store store;

    public produce(store store) {
        this.store = store;
    }

    @Override
    public void run() {
        int i=1;
        while (true){
            store.produck("商品:"+i);
            i++;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
