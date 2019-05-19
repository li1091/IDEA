package Oop;
public class hello {
   public static void main(String[] args){
        person p=new person();
        p.name="李强";
        p.age=18;
        p.height=170;
        System.out.println(p.name);
        person p2=new person("小李",10,150);
        p.TOstring();
   }

}
