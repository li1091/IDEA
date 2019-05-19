package qianfengJAVA.thread;

public class shengchanzhe {
    public static void main(String[] args){
        food food=new food();
        new Thread(new product(food)).start();
        new Thread(new custmerser(food)).start();
    }
}

class food{
    private String name;
    private String desc;
    private boolean flag=true;

    public synchronized void set(String name,String desc){
        if (!flag){ //flag为false才执行
            try {
                wait();//wait只能在同步方法中使用
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name=name;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.desc=desc;
        notify();
        this.flag=false;
    }

    public synchronized void get(){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name+"->"+this.desc);
        this.notify();
        flag=true;
    }
}

class product implements Runnable{
    private food food;

    public product(qianfengJAVA.thread.food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for(int i=0;i<10 ;i++){
            if (i%2==0){
                food.set("青岛","啤酒");
            }else {
                food.set("北京","烤鸭");
            }
        }
    }
}

class custmerser implements Runnable{
    private food food;

    public custmerser(qianfengJAVA.thread.food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for(int i=0;i<10 ;i++){
            food.get();
        }
    }
}
