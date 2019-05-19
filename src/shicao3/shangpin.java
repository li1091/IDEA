package shicao3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class shangpin implements Serializable {
    private static final long serialVersionUID = 4895086918911547723L;
    public int id;
    private String name;
    private double price;
    private String color;
    private int size;
    private int kuchun;
    static LinkedHashMap<Integer,shangpin> map=new LinkedHashMap<>();
    public shangpin(int id, String name, double price, String color, int size,int kuchun) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.size = size;
        this.kuchun = kuchun;
    }

    public shangpin() {
    }

    public static void main(String[] args){
        shangpin s=new shangpin(111,"nick",234,"黑色",38,12);
        shangpin s1=new shangpin(222,"admin",234,"黑色",38,12);
        shangpin s2=new shangpin(333,"361",234,"黑色",38,12);
        shangpin ss=new shangpin();



    }

    public void add(shangpin s){
        map.put(s.id,s);
    }

    public void get(){
        Iterator it=map.keySet().iterator();
        while (it.hasNext()){
            System.out.println(map.get(it.next()));
        }
    }

    public void get(Object key){
        if (!map.containsKey(key)) {
            System.out.println("请输出正确的商品编号!");
            return;
        }
        System.out.println("商品编号  商品名称  商品价格  商品颜色  商品尺寸  商品库存");
        System.out.println(map.get(key));
    }

    @Override
    public String toString() {
        return "" +
                "  " + id +
                "      " + name + '\'' +
                "     " + price +
                "      " + color + '\'' +
                "         " + size +
                "        " + kuchun;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setKuchun(int kuchun) {
        this.kuchun = kuchun;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getKuchun() {
        return kuchun;
    }
}
