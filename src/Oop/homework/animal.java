package Oop.homework;

/**
 * @Auther: zhaoss
 * @Date: 2019/4/25
 * @Description: Oop.homework
 * @version: 1.0
 */
//
public class animal {
    public int age;

    public animal() {

    }
    public animal(int age){
        this.age=age;
    }

    public void ziwojieshao(){

    }

    @Override
    public String toString() {
        return "animal{" +
                "age=" + age +
                '}';
    }
}

class fish extends animal{
    private double weight=0;

    public fish(int age,double weight) {
        super(age);
        this.setWeight(weight);
    }
    
    public void ziwojieshao(){
        System.out.println("我是鱼，我可以游泳");
        System.out.println(toString());
    }

    public void water(){
        System.out.println("鱼可以游泳");
    }

    public double getWeight() {

        return weight;
    }

    @Override
    public String toString() {
        return "自我介绍{" +
                "年龄=" + age +
                ", 重量=" + weight +
                '}';
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }
}

//------------------------------------
class bird extends animal{
    private String color=null;
    public bird(){}

    public void fly(){
        System.out.println("鸟可以飞");
    }

    public void ziwojieshao(){
        System.out.println("我是鸟，我可以飞");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "自我介绍{" +
                "年龄=" + age +
                ", 颜色='" + color + '\'' +
                '}';
    }

    public bird(int age, String color) {
        super(age);
        this.color = color;
    }

    public String getColor() {
    
        return color;
    }

    public void setColor(String color) {
    
        this.color = color;
    }
}
