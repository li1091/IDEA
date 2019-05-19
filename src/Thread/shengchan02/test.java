package Thread.shengchan02;

public class test {
    public static void main(String[] args){
       //final store store=new store(30);
        final store02 store=new store02(30);
        //Runnable target1=new produce(store);
        for(int i=0;i<5 ;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    int i=1;
                    while (true){
                        store.produck("商品:"+i);
                        i++;
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "生产者" + i).start();
        }

       // Runnable target2=new custmer(store);
        for(int i=0;i<10 ;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        store.custmer();
                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "消费者" + i).start();
        }
    }
}
