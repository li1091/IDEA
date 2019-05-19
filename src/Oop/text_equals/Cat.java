package Oop.text_equals;
//equals方法实验
/**
 * @Auther: zhaoss
 * @Date: 2019/4/25
 * @Description: Oop.text_equals
 * @version: 1.0
 */
public class Cat {
    int age;
    double weight;
    String name;

    public Cat(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public boolean equals(Object obj){
        if (this==obj)return true;
        if (obj ==null || getClass() !=obj.getClass())return false;
        if (obj instanceof Cat){
            Cat other=(Cat)obj;
           if (this.age==other.age && Double.compare(this.weight,other.weight) ==0 && this.name.equals(other.name)){
               return true;
           }

        }
        return false;
    }


}