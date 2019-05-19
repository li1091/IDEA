package Thread.shengchan02;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
//使用带锁带队列容器实现多线程访问
public class store02 {
    private BlockingQueue block;

    public store02(int max) {
        //带锁链表
        block=new LinkedBlockingQueue(max);
    }

    public store02(){
        this(10);
    }

    public  void produck(String pro) {
        try {
            block.put(pro);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"生产商品:"+pro+" "+"目前商品数量:"+block.size());

    }

    public synchronized void custmer() {
        String name=null;
        try {
            name=(String) block.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"消费商品:"+name+" "+"目前商品数量:"+block.size());
    }
}
