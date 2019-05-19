package qianfengJAVA.Coliction.Arraylist;

import java.util.ListIterator;

public class MyarrList {
    private int size=0;
    Object[] element;
    private final int defaul=5;
    private int cont=0;

    public MyarrList() {
        this(10);
    }

    public MyarrList(int len){
        if (len<0){
            throw new IllegalArgumentException("初始化长度必须大于等于0："+len);
        }
        element=new Object[len];
    }

    public boolean add(Object o){
        ensure(size+1);
        element[size++]=o;
        return true;
    }

    public void ensure(int s){
        //如果size大于当前数组长度就扩容
        ensureExp(calculate(element,s));
    }



    //如果为空返回10
    private int calculate(Object[] o,int min){
        if (element==null){
            return defaul;
        }
        return min;
    }

    private void  ensureExp(int min){
        cont++;
        if (min > element.length){
            grow(min);
        }
    }

    private void grow(int min){
        int old=element.length;
        int newlength=old+(old/2);
        if (newlength-min <0){
            newlength=min;
        }

        element=arrcopy(element,min);
    }

    private Object[] arrcopy(Object[] o,int len){
        Object[] copy=new Object[len];

            for (int i = 0; i < size; i++) {
                copy[i] = o[i];
            }
        return copy;
    }

    public void remove(int index){
        if (index >=element.length){
            System.out.println("数组越建");
            return;
        }
        fastremove(index);

    }

    private void fastremove(int index){
        if (index>0){
            arrcopy(index);
            element[size-1]=null;
            size--;
        }
    }

    private void arrcopy(int copy){
        int i=copy;
        for(;i<size-1;i++){
            element[i]=element[i+1];

        }
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder("[");
        for(Object o:element){
            builder.append(o+",");
        }
        builder.setCharAt(builder.length()-1,']');
        return builder.toString();
    }

    public listItr listIterator(){
        return new listItr(0);
    }

    private class listItr implements ListIterator{
        int cursor;
        int cont=size;
        listItr(int cursor){
            this.cursor=cursor;
        }

        @Override
        public boolean hasNext() {

            return cursor !=size;
        }

        @Override
        public Object next() {
            int i=cursor;
            Object[] ele=MyarrList.this.element;
            cursor=i+1;
            return ele[i];
        }

        @Override
        public boolean hasPrevious() {
            return cont !=0;
        }

        @Override
        public Object previous() {
            int i=cont-1;
            Object[] ele=MyarrList.this.element;
            cont=i;
            return ele[i];
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Object o) {

        }

        @Override
        public void add(Object o) {

        }
    }
}
