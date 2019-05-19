package WLBC.demo02;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        try {
            //建立客户端
            Socket socket=new Socket("192.168.153.24",8888);
            Scanner scanner=new Scanner(System.in);
            System.out.print("账号：");
            String name=scanner.next();
            System.out.print("密码：");
            String pass=scanner.next();
            user user=new user(name,pass);
            //将对象装入对象流
            ObjectOutputStream out=new ObjectOutputStream(socket.getOutputStream());
            //输出数据
            out.writeObject(user);

            socket.shutdownOutput();
            DataInputStream in=new DataInputStream(socket.getInputStream());
            System.out.println("登录结果是: "+in.readUTF());

            out.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

