package Thread;

public class test {
    public static void main(String[] args){
        //加入线程之前运行，不参与争抢
        for(int i=0;i<10 ;i++){
            System.out.println("main");
        }

        //加入子线程，争抢CPU
        threadDeamo deamo=new threadDeamo();
        Thread thread=new Thread(deamo,"a");
        deamo.start();
        for(int i=0;i<10 ;i++){
            System.out.println("test");
        }
    }
}
