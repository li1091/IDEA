package Oop.duotai;

import java.util.Iterator;
import java.util.LinkedList;

public class fanxing<E> {
    public void a(E e){ }

    public static  <B> void b(B b){}

    public void f(E[] e){}

    public <S> void k(S...s){

    }
}

class a{
    public static void main(String[] args){
        fanxing f=new fanxing();
        //fanxing<String> f2=new fanxing<>();
        fanxing<Integer> f2=new fanxing();
        f2.a(1);
    }
}
