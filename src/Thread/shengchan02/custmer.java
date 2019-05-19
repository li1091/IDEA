package Thread.shengchan02;

public class custmer implements Runnable {
    private store store;

    public custmer(store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true){
            store.custmer();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
