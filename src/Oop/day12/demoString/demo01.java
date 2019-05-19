package Oop.day12.demoString;

public class demo01 {
    /**
     * 两字符串只要值不同，就会生成两个字符数组
     * 但如果值相同就会指向同一个常量池中的字符数组。
     * @param args
     */
    public static void main(String[] args){
        String s1="abc";
        String s2="a"+"b"+"c";
        String s3="bzx";
        String s4=s1+"cde";
        System.out.println(s1==s4);
        /*面试题
        String s4=new String("abc");
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s4);
        System.out.println(s1==s2);*/

    }
}
