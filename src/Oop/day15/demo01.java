package Oop.day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class demo01 {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
       /* for(String str:list){
            System.out.println(str);
        }
        System.out.println(list.toString());*/

        //迭代器遍历容器
       /*使用迭代器遍历数组时，hasnext和next方法配套使用
        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/
        ListIterator li=list.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
         System.out.println("-----------------------");
       /* while (li.hasPrevious()){
            System.out.println(li.previous());
        }*/
        System.out.println(li.hasPrevious());
        System.out.println(li.hasNext());

    }
}
