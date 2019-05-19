package WLBC.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Resive {
    public static void main(String[] args){
        System.out.println("老师上线");
        try {
            //1.建立套接字对象
            DatagramSocket ds=new DatagramSocket(9999);
            byte[] talk=new byte[1024];
            Scanner scanner=new Scanner(System.in);

            while (true){
                //接收
                //2.创建包，将数组及长度，发送方的IP或主机名，端口号传入
                DatagramPacket packet=new DatagramPacket(talk,talk.length, InetAddress.getByName("localhost"),8888);
                //3用这个包装数据
                ds.receive(packet);
                int i=packet.getLength();
                //4.返回的是个byte数组，0到有效长度
                String str=new String(packet.getData(),0,packet.getLength());
                System.out.println("学生说: "+str);
                if ("bye".equals(str))break;

                //发送
                System.out.print("老师说: ");
                talk=scanner.next().getBytes();
                //1.将要发送的数据转成byte数组，装进包中
                DatagramPacket packet1=new DatagramPacket(talk,talk.length,InetAddress.getByName("localhost"),8888);
                //2.用套接子对象的send方法，将包发送出去
                ds.send(packet1);
            }

            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
