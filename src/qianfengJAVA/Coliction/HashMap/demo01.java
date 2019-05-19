package qianfengJAVA.Coliction.HashMap;

import java.util.HashMap;

public class demo01 {
    public static void main(String[] args){
        MyhashMap map=new MyhashMap();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        map.put(1,"xxx");
        map.put("学号","李强");
        System.out.println(map.toString());
        map.remove(3);
        System.out.println(map.toString()+map.size);
        System.out.println(map.getnode("c"));

        //自定义student类 重写hascode,equls
       /* map.put("一零一",new student(10,"李强"));
        map.put("一零二",new student(20,"赵四儿"));
        System.out.println(map.toString());*/
    }
}
