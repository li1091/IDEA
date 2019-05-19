package shicao3;

import java.io.*;
import java.util.ArrayList;

public class gouwuche {
    private int id;
    private String name;
    private int num;
    private double price;
    static ArrayList<gouwuche> list=new ArrayList<>();

    public gouwuche() {
    }

    public gouwuche(int id, String name, int num, double price) {
        this.id = id;
        this.name = name;
        this.num = num;
        this.price = price;
    }

    @Override
    public String toString() {
        System.out.println("商品编号  商品名称  商品价格  商品颜色  商品尺寸  商品库存");
        return "gouwuche{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", price=" + price +
                '}';
    }

    public gouwuche(gouwuche g) {
        list.add(g);
    }

    public void get(){
        for(gouwuche g:list){
            System.out.println(g);
        }
    }

    public void iterator(){
        for(gouwuche g:list){
            System.out.println(g);
        }
    }

    public void io(){
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(new File("f:\\test\\sql.txt")));
            out.writeObject(list);
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
