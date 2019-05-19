package qianfengJAVA.Coliction.Arraylist;

import java.util.ListIterator;

public class demo101 {
    public static void main(String[] args){
        MyarrList list=new MyarrList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("bbb");
        list.add("ccc");
       /* for(Object o:list.element){
            System.out.println(o);
        }
        System.out.println(list.element.length);*/
       /* list.remove(2);
        System.out.println(list.toString());*/
        ListIterator iterator=list.listIterator();

        /*while (iterator.hasNext()){
            if ("ccc".equals(iterator.next())){
                list.add("ddd");
            }
        }*/
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

    }
}
