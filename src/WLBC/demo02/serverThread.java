package WLBC.demo02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class serverThread implements Runnable {
    ObjectInputStream in=null;
    Socket socket=null;

    public serverThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            in=new ObjectInputStream(socket.getInputStream());
            user user=(WLBC.demo02.user)(in.readObject());

            String str=null;
            if(user.getUsername().equals("lili")&&user.getPassword().equals("123123")){
                str="登陆成功";
            }else{
                str="登陆失败";
            }

            socket.shutdownInput();
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            out.writeUTF(str);

            in.close();
            out.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
