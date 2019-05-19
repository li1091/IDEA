package Thread.shengchan02;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class store {
    private ArrayList<String> list=new ArrayList<>();
    private int max=10;
    private Lock lock=new ReentrantLock();//使用lock锁
    private Condition p=lock.newCondition();//新建一个等待队列
    private Condition c=lock.newCondition();

    public store(int max) {
        this.max = max;
    }

    public store(){
        this(10);
    }

    public  void produck(String pro) {
        /*while (list.size()==max){
            try {             //wait对，只能放在同步方法中，因为他的功能就是释放所，但如果没锁它还释放什么。
                this.wait(); //如果这里是if这里只会锁一个线程，如果多个线程同时都走到这里
                            //其他生产者线程仍然会继续执行下面的命令。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }*/
        //使用lock锁技术
        lock.lock();
        try {
            while (list.size()==max){
                try {
                    p.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(pro);
            System.out.println(Thread.currentThread().getName()+"生产商品:"+pro+" "+"目前商品数量:"+list.size());
            //this.notify();
           c.signal();

        }finally {
            lock.unlock();
        }

    }

    public synchronized void custmer() {
        /*while (list.size()==0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        //使用lock锁
        lock.lock();
        try {
            while (list.size()==0){
                try {
                    c.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            String name=list.remove(0);
            System.out.println(Thread.currentThread().getName()+"消费商品:"+name+" "+"目前商品数量:"+list.size());
            //this.notify();
            p.signalAll();

        }finally {
            lock.unlock();
        }

    }
}
