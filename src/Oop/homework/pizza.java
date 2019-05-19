package Oop.homework;

/**
 * @Auther: zhaoss
 * @Date: 2019/4/25
 * @Description: Oop.homework
 * @version: 1.0
 */
public class pizza {
    String name;
    int cost,size;

    public pizza(String name, int cost, int size) {
        this.name = name;
        this.cost = cost;
        this.size = size;
    }

    @Override
    public String toString() {
        return null;
    }
}

class peigen extends pizza{
    private int keshu;
    public peigen(String name, int cost, int size,int keshu) {
        super(name, cost, size);
        this.keshu=keshu;
    }

    @Override
    public String toString() {
        return  "名称："+name+"\n"+"价格："+cost+"\n"+"大小："+size+"\n"+"克数"+keshu;
    }
}

class haixian extends pizza{
    private int keshu;
    public haixian(String name, int cost, int size,int keshu) {
        super(name, cost, size);
        this.keshu=keshu;
    }

    @Override
    public String toString() {
        return "名称："+name+"\n"+"价格："+cost+"\n"+"大小："+size+"\n"+"克数"+keshu;
    }
}
