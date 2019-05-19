package Oop.day10.Homework;

import java.util.Comparator;

/**
 * @Auther: zhaoss
 * @Date: 2019/4/26
 * @Description: Oop.day10.Homework
 * @version: 1.0
 */
public class bijiaoqi implements Comparator{


    @Override
    public int compare(Object o1, Object o2) {
        student stu1=(student)o1;
        student stu2=(student)o2;
        int a=stu1.age-stu2.age;
        int t=((Double)stu1.tall).compareTo(stu2.tall);
        int n=stu1.name.compareTo(stu2.name);
        if (a==0 && t==0 && n==0){  //age相等
            return 0;
        }

        return 1;

    }
}
