package Oop.day12.demoString;

public class demo01 {
    /**
     * ���ַ���ֻҪֵ��ͬ���ͻ����������ַ�����
     * �����ֵ��ͬ�ͻ�ָ��ͬһ���������е��ַ����顣
     * @param args
     */
    public static void main(String[] args){
        String s1="abc";
        String s2="a"+"b"+"c";
        String s3="bzx";
        String s4=s1+"cde";
        System.out.println(s1==s4);
        /*������
        String s4=new String("abc");
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s4);
        System.out.println(s1==s2);*/

    }
}
