package IO;

import java.io.*;

//对象流练习
public class ObjectstreamDemo {
    public static void main(String[] args){
        out("f:\\test\\a.txt");
        in("f:\\test\\a.txt");

    }
//读取文件中的对象数据
    private static void in(String file){
        try {
            ObjectInputStream input=new ObjectInputStream(new FileInputStream(new File(file)));
            student o=(student) input.readObject();
            System.out.println(o);
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
//将对象写入文件
    private static void out(String file){
        try {
            ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(new File(file)));
            out.writeObject(new student(18,"李强"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
