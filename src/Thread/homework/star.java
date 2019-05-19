package Thread.homework;

public class star {
    public static void main(String[] args){
        print print=new print();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=52 ;i+=2){
                    print.num(i);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(char i='A';i<='Z';i++){
                    print.En(i);
                }
            }
        }).start();
    }
}
