package Thread.shengchanzhe;

public class test {
    public static void main(String[] args){
        product p=new product();
        new Thread(new shengchan(p)).start();
        new Thread(new xiaofei(p)).start();
    }
}
