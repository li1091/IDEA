package Thread.homework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T4 {
    public static void main(String[] args){
        sales sales=new sales(30);
        for(int i=0;i<3 ;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    sales.sale();
                }
            },"线程"+i).start();
        }
    }
}

class sales{
    private int cont;
    Lock lock=new ReentrantLock();
    public sales(int cont) {
        this.cont = cont;
    }

    public void sale(){
        while (cont >0){
            lock.lock();
            try {
                System.out.println(Thread.currentThread().getName()+" : "+(cont--));

            }finally {
                lock.unlock();
            }
        }

    }


}
