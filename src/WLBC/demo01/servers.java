package WLBC.demo01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class servers {
    public static void main(String[] args){
        try {

            ServerSocket server=new ServerSocket(8888);
            Socket socket=server.accept();
            DataInputStream in=new DataInputStream(socket.getInputStream());
            System.out.println(in.readUTF());

            socket.shutdownInput();
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            out.writeUTF("你也好");

            in.close();
            out.close();
            socket.close();
            server.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
