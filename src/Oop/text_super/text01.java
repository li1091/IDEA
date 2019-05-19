package Oop.text_super;
//super关键字练习
/**
 * @Auther: zhaoss
 * @Date: 2019/4/25
 * @Description: Oop.text_super
 * @version: 1.0
 */
public class text01 {
    public static void main(String[] args){
        b b=new b();
    }
}

class a{
    int age=10;
    public void a(){
        int age=20;
        this.age=30;
        age=40;
    }
}

class b extends a{
    int age=50;
    public void b(){
        int age=60;
        this.age=70;
        age=80;
        super.age=90;
        super.a();
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
