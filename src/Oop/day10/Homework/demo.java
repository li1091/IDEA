package Oop.day10.Homework;

/**
 * @Auther: zhaoss
 * @Date: 2019/4/26
 * @Description: Oop.day10.Homework
 * @version: 1.0
 */
public class demo {
    public static void main(String[] args){
        student stu1=new student(12,170.3,"az");
        student stu2=new student(11,170.3,"az");
        int s=((Double)stu1.tall).compareTo((Double)stu2.tall);
        /*System.out.println(stu1.age-stu2.age);
        System.out.println(s);
        System.out.println(stu1.name.compareTo(stu2.name));*/
        //重写方法，内部比较类
        //System.out.println(stu1.compareTo(stu2));
        System.out.println(stu1.compareTo(stu2));
        //外部比较器，重写接口方法
        bijiaoqi bj=new bijiaoqi();
        System.out.println(bj.compare(stu1,stu2));
    }
}
