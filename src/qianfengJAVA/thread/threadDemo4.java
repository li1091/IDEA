package qianfengJAVA.thread;

import java.util.concurrent.locks.ReentrantLock;

public class threadDemo4 {
    public static void main(String[] args){
        myrun myrun=new myrun();
        myrun myrun1=new myrun();
        new Thread(myrun).start();
        new Thread(myrun1).start();
    }

}

class myrun implements Runnable{
    private static int cont=10;

    @Override
    public void run() {
        for(int i=0;i<10 ;i++){

                /*synchronized (this){
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("车票还剩"+(cont--)+"张");
                }*/
                //methed();
                methed2();

        }
    }

    private synchronized void methed(){
        if (cont>0) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("车票还剩" + (cont--) + "张");
        }
    }

    ReentrantLock lock=new ReentrantLock();
    private void methed2(){
        lock.lock();
        if (cont>0) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("车票还剩" + (cont--) + "张");
        }
        lock.unlock();
    }
}
