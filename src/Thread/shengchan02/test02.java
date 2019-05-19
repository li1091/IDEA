package Thread.shengchan02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test02 {
    public static void main(String[] args){
        ExecutorService pool= Executors.newCachedThreadPool();
        //final store store=new store(30);
        final store02 store=new store02(30);
        //Runnable target1=new produce(store);

        for(int i=0;i<5 ;i++){
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    int i=1;
                    while (true){
                        store.produck("商品:"+i);
                        i++;
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }

        // Runnable target2=new custmer(store);
        for(int i=0;i<10 ;i++){
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        store.custmer();
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
        pool.shutdown();
    }
}
