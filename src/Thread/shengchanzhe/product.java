package Thread.shengchanzhe;

public class product {
    private String pinpai;
    private String name;
    private boolean flag=false;

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinpai() {
        return pinpai;
    }

    public String getName() {
        return name;
    }

    public synchronized void setproduct(String pinpai,String name){
        if (flag==true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            this.setPinpai(pinpai);
            this.setName(name);
            System.out.println("生产者生产了："+this.getPinpai()+"----"+this.getName());
            flag=true;
            notify();

    }

    public synchronized void getproduct(){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("消费者消费，消费了："+this.getPinpai()+"----"+this.getName());
            flag=false;
            notify();
    }
}
