package Thread.homework;

public class T3 {
    public static void main(String[] args){
        Print p=new Print();
        for(int i=0;i<3 ;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<4 ;i++){
                       p.print();
                    }
                }
            },i+"").start();
        }
    }
}

class Print{
    int no=1;
    int status=0;

    public synchronized void print(){
        int threadname=Integer.parseInt(Thread.currentThread().getName());
        while ((status%3) !=threadname){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("线程"+threadname+":");
        for(int cont=0;cont<5 ;cont++){
            if (cont>0)System.out.print(",");
            System.out.print(no++);
        }
        System.out.println();
        status=(status%3)+1;
        this.notify();
    }
}
