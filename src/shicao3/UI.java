package shicao3;

import java.util.Scanner;

public class UI {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        while (true) {
            System.out.println("----------欢迎进入京东商城----------");
            System.out.println();
            System.out.println();
            System.out.println("          1.添加商品");
            System.out.println("          2.查询所有商品");
            System.out.println("          3.查看指定编号的商品");
            System.out.println("          4.添加商品到购物车");
            System.out.println("          5.显示购物车");
            System.out.println("          6.保存购物车");
            System.out.println("          7.退     出");
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.print("          请选择(1-7):");
            int x=scanner.nextInt();
            switch (x) {
                case 1:
                    add();
                    break;
                case 2:
                    new shangpin().get();
                    break;
                case 3:
                    new shangpin().get(scanner.nextInt());
                    break;
                case 4:
                    addgouwu();
                    break;
                case 5:
                    showgouwu();
                    break;
                case 6:
                    new gouwuche().io();
                    break;
                case 7:
                    System.out.println("感谢使用 再见！");
                    return;
            }
        }//while
    }

    private static void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入商品编号");
        int id=scanner.nextInt();
        System.out.println("请输入商品名称");
        String name=scanner.next();
        System.out.println("请输入商品价格");
        double price=scanner.nextDouble();
        System.out.println("请输入商品颜色");
        String color=scanner.next();
        System.out.println("请输入商品尺寸");
        int size=scanner.nextInt();
        System.out.println("请输入商品库存");
        int kucun=scanner.nextInt();
        shangpin shangpin=new shangpin();
        shangpin.add(new shangpin(id,name,price,color,size,kucun));

    }

    private static void addgouwu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入商品编号");
        int id=scanner.nextInt();
        System.out.println("请输入商品数量");
        int num=scanner.nextInt();
        if (shangpin.map.containsKey(id)){
            shangpin s=shangpin.map.get(id);
            gouwuche.list.add(new gouwuche(s.id,s.getName(),num,s.getPrice()*num));
            System.out.println("添加商品成功");
        }else {
            System.out.println("该商品不存在");
        }

    }

    private static void showgouwu(){
        for(gouwuche g:gouwuche.list){
            System.out.println(g);
        }
    }
}
