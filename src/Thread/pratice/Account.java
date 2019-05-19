package Thread.pratice;

public class Account {
    int money=600;
    public void getmoney(int money){
        this.money=money;
    }

    public int getbalance(){
        return money;
    }
}
