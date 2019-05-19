package Oop.day16.TreeSet;

import java.util.HashMap;
import java.util.Map;

public class demo_hashmap {
    public static void main(String[] args){
        student stu=new student(14,"a",171.2);
        student stu1=new student(12,"b",160.2);
        student stu2=new student(18,"c",158.2);

        Map<Integer,student> map=new HashMap<>();
        map.put(1,stu);
        map.put(2,stu1);
        map.put(3,stu2);

    }
}
