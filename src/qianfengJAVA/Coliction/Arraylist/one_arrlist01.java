package qianfengJAVA.Coliction.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class one_arrlist01 {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("mason");
        list.add("lisa");
        list.add("ben");
        for (String s:list){
            System.out.println(s);
        }
        list.remove("lisa");
        System.out.println(list);
    }
}
