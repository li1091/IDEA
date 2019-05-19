package qianfengJAVA.Coliction.Linkedlist;

import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class two_linklist {
    public static void main(String[] args){
        Mylinkedlist list=new Mylinkedlist();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Map<String, String> map = new HashMap<String, String>();
        String s = "code";
        map.put(s, "1");
        ListIterator itr=list.listitr();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
