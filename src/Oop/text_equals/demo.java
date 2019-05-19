package Oop.text_equals;

/**
 * @Auther: zhaoss
 * @Date: 2019/4/25
 * @Description: Oop.text_equals
 * @version: 1.0
 */
public class demo {
    public static void main(String[] args){
        Cat c1=new Cat(3,2.2,"whitecat");
        Cat c2=new Cat(3,2.2,"whitecat");
        boolean b=c1.equals(c2);
        System.out.println(b);
    }
}
