import java.util.HashMap;
import java.util.LinkedList;

public class demo {
    public static void main(String[] args){
        HashMap<Integer,student> map=new HashMap<>();
        LinkedList<student> list=new LinkedList<>();
        student stu=new student(1,"a");
        student stu1=new student(7,"d");
        student stu2=new student(9,"g");
        list.add(stu);list.add(stu1);list.add(stu2);
        for(student s:list){
            map.put(s.age,s);
        }
        for(Integer s:map.keySet()){
            System.out.println(map.get(s));
        }


    }

    private static void sore(student[] arr,int low,int hei){
        if (low>=hei){  //134
            return;
        }
        int i=low;
        int j=hei;
        student key=arr[i];
        //{3,4,6,1,8}
        while (i<j) { //
            while (arr[j].compareTo(key)> 0 && i<j) {//134
                j--;  //0
            }
            student t;
            t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;       //134
            while (arr[i].compareTo(key)< 0 && i<j) {
                i++;
            }
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t; //468 3 3

        } //外循环结束


        sore(arr,0,i-1); //0 0
        sore(arr,i+1,hei);// 4 4
    }

}
