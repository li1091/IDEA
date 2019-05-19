package qianfengJAVA.Coliction;

import java.util.LinkedList;
import java.util.ListIterator;

//遍历集合的三种方式
public class iteratorDemo {
    public static void main(String[] args){

        LinkedList<String> list=new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //foreach
       /* for(String str:list){
            System.out.println(str);
        }*/
        //lmb表达式
        list.forEach((String s)->{System.out.println(s);});
        ListIterator<String> it=list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
