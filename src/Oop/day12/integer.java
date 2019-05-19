package Oop.day12;

public class integer {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int a=new Integer(12);
        int b=new Integer("112");
        System.out.println(a+b);
        Integer a1=Integer.valueOf("12");
        int a2=Integer.valueOf(1);
        System.out.println(a1+a2);
        Integer a3=new Integer(129);
        Integer a4=new Integer(129);
        a3.compareTo(a4);
        System.out.println(a3==a4);

    }
}
