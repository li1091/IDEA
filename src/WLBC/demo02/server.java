package WLBC.demo02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args){

        try {
            ServerSocket server=new ServerSocket(8888);
            Socket socket=null;
            int cont=0;
            while (true){
                socket=server.accept();
                //启动一个线程，将任务类传入线程
                new Thread(new serverThread(socket)).start();
                cont++;
                System.out.println("当前是第"+cont+"个用户在访问,当前用户的ip是："+socket.getInetAddress());
            }
            /*ObjectInputStream in=new ObjectInputStream(socket.getInputStream());
            user user=(user)(in.readObject());

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
            server.close();*/

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
