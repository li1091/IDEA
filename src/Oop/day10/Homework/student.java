package Oop.day10.Homework;

/**
 * @Auther: zhaoss
 * @Date: 2019/4/26
 * @Description: Oop.day10.Homework
 * @version: 1.0
 */
//实现接口，重写内部比较累
public class student implements Comparable {
    int age;
    double tall;
    String name;

    public student(int age, double tall, String name) {
        this.age = age;
        this.tall = tall;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        student stu=(student)o;
        //return this.age-((student) o).age;
        //return ((Double)this.tall).compareTo(stu.tall);
        int a=this.age-stu.age;
        int t=((Double)this.tall).compareTo(stu.tall);
        int n=this.name.compareTo(stu.name);
        if (a==0 && t==0 && n==0){  //age相等
            return 0;
        }

        return 1;
    }
}
