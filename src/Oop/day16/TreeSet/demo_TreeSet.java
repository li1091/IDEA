package Oop.day16.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class demo_TreeSet {
    public static void main(String[] args){
        Set<student> set=new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {

                return -(o1.getAge()-o2.getAge());
            }
        });
        set.add(new student(18,"a",165.5));
        set.add(new student(16,"b",160.3));
        set.add(new student(14,"c",171.2));
        System.out.println(set);

    }
}
