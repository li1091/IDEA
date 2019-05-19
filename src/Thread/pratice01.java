package Thread;
//龟兔赛跑
public class pratice01 {
    public static void main(String[] args){
        tortoise tortoise=new tortoise("乌龟");
        tortoise.setPriority(8);
        tortoise.start();
        rabbit rabbit=new rabbit("兔子");
        rabbit.setPriority(2);
        rabbit.start();

    }
}

class tortoise extends Thread{
    public tortoise(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<10 ;i++){
            System.out.println(this.getName()+"线程");
        }
    }
}

class rabbit extends Thread{
    public rabbit(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i=0;i<10 ;i++){
            System.out.println(this.getName()+"线程");
        }
    }
}
