package WLBC.demo01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args){
        try {
            //
            Socket socket=new Socket("localhost",8888);
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            out.writeUTF("你好服务器");

            socket.shutdownOutput();
            DataInputStream in=new DataInputStream(socket.getInputStream());
            System.out.println(in.readUTF());

            out.close();
            in.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
