package Thread;

public class threadDeamo extends Thread{
    public static void main(String[] args){
        myrunnble myrunnble=new myrunnble();
        Thread thread=new Thread(myrunnble);
        thread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}

class myrunnble implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=10 ;i++){
            System.out.println(Thread.currentThread().getName()+"--"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
