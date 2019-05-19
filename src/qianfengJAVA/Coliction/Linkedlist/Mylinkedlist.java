package qianfengJAVA.Coliction.Linkedlist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Mylinkedlist<E> {
    private node first;
    private int size;
    private node last;

    public static void main(String[] args){
        Mylinkedlist<String> list=new Mylinkedlist<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        System.out.println(list.toString());
        System.out.println(list.getnode(3).element);
        list.remove(0);
        System.out.println(list.toString());
        list.add(0,"kk");
        System.out.println(list.toString()+list.size);
        list.add(4,"xx");
        System.out.println(list.toString()+list.size);


    }

    public void add(E element){
        node node=new node(null,element,null);
        if (first==null){
            first=node;
            last=node;
        }else {
            last.next=node;
            node.pre=last;
            last=node;
        }
        size++;
    }

    @Override
    public String toString() {
        LinkedList<String> list=new LinkedList<>();
        list.iterator();
        node temp=first;
        StringBuilder builder=new StringBuilder("[");
        while (temp!=null){
            builder.append(temp.element+",");
            temp=temp.next;
        }
        builder.setCharAt(builder.length()-1,']');

        return builder.toString();
    }

    public node getnode(int index){
        if (index <0 || index >size-1){
            throw new RuntimeException("索引不合法->"+index);
        }

        node temp;
        if (index <= (size>>1)){
            temp=first;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
        }else {
            temp=last;
            for(int i=size-1;i >index;i--){
                temp=temp.pre;
            }

        }

        return temp;
    }

    public boolean remove(int index){
       //个人写法
       node temp=getnode(index);
        if (temp==first){
            first=temp.next;
            temp.next.pre=null;
        }else if (temp==last){
            last=temp.pre;
            temp.pre.next=null;
        }else {
            temp.pre.next=temp.next;
            temp.next.pre=temp.pre;
        }
        size--;
        return temp !=null?true:false;
    }

    public boolean add(int index,E element){
        yichang(index);

        node temp=getnode(index);
        if (temp !=null){
            node up=temp.pre;
            node nownode=new node(up,element,temp);
            if (up ==null){
                first=nownode;
            }else {
                up.next=nownode;
            }
            temp.pre=nownode;
            size++;
        }

        return true;
    }

    public listiterator listitr(){
        return new listiterator();
    }

    private void yichang(int index){
        if (index <0 || index >size-1){
            throw new RuntimeException();
        }
    }

    class node{
        private node pre;
        private Object element;
        private node next;

        public node(node pre, Object element, node next) {
            this.pre = pre;
            this.element = element;
            this.next = next;
        }

        public node getPre() {
            return pre;
        }

        public Object getElement() {
            return element;
        }

        public node getNext() {
            return next;
        }

        public void setPre(node pre) {
            this.pre = pre;
        }

        public void setElement(Object element) {
            this.element = element;
        }

        public void setNext(node next) {
            this.next = next;
        }
    }

    private class listiterator implements ListIterator{
        int cursor=0;

        @Override
        public boolean hasNext() {

            return cursor !=size;
        }

        @Override
        public Object next() {
            int i=cursor;
            Object n=Mylinkedlist.this.getnode(i).element;
            cursor=i+1;
            return n;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public Object previous() {
            return null;
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
