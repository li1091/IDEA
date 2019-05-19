package Thread.lock2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Readwritelock {
    public static void main(String[] args){
        final operator operator=new operator();
        //创建5个读线程
        for(int i=0;i<5 ;i++){
            new Thread("读线程"+i){
                @Override
                public void run() {
                    while (true){
                        operator.read();
                    }
                }
            }.start();
        }
        //创建5个写线程
        for(int i=0;i<5 ;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        operator.write();
                    }
                }
            }, "写线程" + i).start();
        }
    }
}
class operator{
   //private Lock lock=new ReentrantLock();
    private ReentrantReadWriteLock rwl=new ReentrantReadWriteLock();

   public void read(){
        //lock.lock();
       rwl.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"开始读取数据........");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"读取数据完毕.............");
        }finally {
            //lock.unlock();
            rwl.readLock().unlock();
        }
   }

   public void write(){
       //lock.lock();
       rwl.writeLock().lock();
       try{
           System.out.println(Thread.currentThread().getName()+"开始写数据........");
           try {
               Thread.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName()+"写数据完毕.............");
       }finally {
           //lock.unlock();
           rwl.writeLock().unlock();
       }
   }
   }

