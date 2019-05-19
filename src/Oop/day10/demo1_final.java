package Oop.day10;

/**
 * @Auther: zhaoss
 * @Date: 2019/4/26
 * @Description: Oop.day10
 * @version: 1.0
 */
public class demo1_final {
    public static void main(String[] args){
        final int a=10;
        int x=person.a;
        person.aaa();

    }
}

final class person{ //不能继承
    private person(){}//不能建对象
    final static int a=3;//(不能建对象，所以要static从属类)可以使用但不能修改
    public final static void aaa(){//可以使用,不能被重写
        System.out.println("aaa");
    }

}

