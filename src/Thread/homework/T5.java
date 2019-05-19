package Thread.homework;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class T5 {
    public static void main(String[] args){
        computer com=new computer();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10 ;i++){
                    com.put();
                }
            }
        },"生产者").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10 ;i++){
                    com.get();
                }
            }
        },"消费者").start();
    }
}

class computer{
     Lock lock=new ReentrantLock();
     Condition pro=lock.newCondition();
     Condition con=lock.newCondition();
    boolean flag=false;

    public void put(){
        lock.lock();
        try {
            if (flag){
                try {
                    pro.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("生产电脑");
            flag=true;
            con.signalAll();

        }finally {
            lock.unlock();
        }

    }

    public void get(){
        lock.lock();
        try {
            if (!flag){
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费电脑");
            flag=false;
            pro.signalAll();

        }finally {
            lock.unlock();
        }

    }
}
