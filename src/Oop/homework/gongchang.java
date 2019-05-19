package Oop.homework;

import java.util.Scanner;

/**
 * @Auther: zhaoss
 * @Date: 2019/4/25
 * @Description: Oop.homework
 * @version: 1.0
 */
//披萨工厂类
public class gongchang {
    
    public static void main(String[] args){
        pizza p;
        System.out.print("请选择想要制作的披萨(1.培根披萨 2.海鲜披萨):");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        while (a<1 || a>2){
            System.out.print("输入错误，请重新输入：");
            a=s.nextInt();
        }

        System.out.print("请输入披萨克数:");
        int keshu=s.nextInt();
        System.out.print("请输入披萨大小:");
        int size=s.nextInt();
        System.out.print("请输入披萨价格:");
        int cost=s.nextInt();

        if (a==1){
           p=new peigen("培根披萨",cost,size,keshu);
           System.out.println();
           System.out.println(p.toString());

        }else if (a==2){
            p=new haixian("海鲜披萨",cost,size,keshu);
            System.out.println();
            System.out.println(p.toString());
        }

    }

    public void shengchan(int a){
        gongchang g=new gongchang();
        if (a==1){
            g.peigen();
        }else if (a ==2){
            g.haixian();
        }

    }

    private void peigen(){

    }

    private void haixian(){

    }
}
