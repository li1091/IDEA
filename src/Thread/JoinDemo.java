package Thread;

public class JoinDemo extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(this.getName()+"---------"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo joinDemo=new JoinDemo();
        for(int i=1;i<=10 ;i++){
            if (i==6){
                joinDemo.start();
                joinDemo.join();
            }
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }
}
