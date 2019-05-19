package Oop;

public class person {
   String name;
   int age;
   int height;
   public person(){}
    public static void main(String[] args){
        
    }
   public person(String name,int age,int height){
       this.name=name;
       this.age=age;
       this.height=height;

   }

   
   public void TOstring(){
       System.out.println("名字"+name+"年龄"+age+"身高"+height);
   }
   
   public void sleep(String str){
       System.out.println(name+"在"+str+"睡觉");
   }
}


