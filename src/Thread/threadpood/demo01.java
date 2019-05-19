package Thread.threadpood;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class demo01 {
    public static void main(String[] args){
        ThreadPoolExecutor pool=new ThreadPoolExecutor(1,3,3, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(2));

    }
}

class a implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("当前执行任务的线程为："+Thread.currentThread().getName());
        }

    }
}
