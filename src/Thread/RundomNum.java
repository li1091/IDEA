package Thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//线程类创建第三种方式
public class RundomNum implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        System.out.println("-----------");
        Thread.sleep(3000);
        return new Random().nextInt(10);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask ft=new FutureTask(new RundomNum());
        Thread thread=new Thread(ft);
        thread.start();
        System.out.println("当前线程是否执行完成"+ft.isDone());
        Integer i=(Integer)(ft.get());
        System.out.println(i);
        System.out.println("当前线程是否执行完成"+ft.isDone());

    }
}
