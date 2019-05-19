package IO;

import java.io.*;

//数据流练习
public class datestreamDemo {
    public static void main(String[] args){
        //out("F:\\test\\a.txt");
        read("F:\\test\\a.txt");
        try {
            BufferedReader reader=new BufferedReader(new FileReader(new File("")));
            String str=reader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void out(String file){
        try {
            DataOutputStream data=new DataOutputStream(new FileOutputStream(new File(file)));
            data.write(19);
            data.writeUTF("李强啊啊啊");
            data.writeDouble(77.333);
            data.writeBoolean(true);
            data.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(String file){
        try {
            DataInputStream in=new DataInputStream(new FileInputStream(new File(file)));
            System.out.println(in.read());
            System.out.println(in.readBoolean());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
