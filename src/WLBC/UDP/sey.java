package WLBC.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class sey {
    public static void main(String[] args){
        System.out.println("学生上线");
        try {
            DatagramSocket ds=new DatagramSocket(8888);
            Scanner scanner=new Scanner(System.in);
            while (true){
                //发送
                System.out.print("学生说: ");
                java.lang.String str=scanner.next();
                if ("bye".equals(str)){
                    System.out.println("学生下线");
                    break;
                }
                byte[] bytes=str.getBytes();
                DatagramPacket packet=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),9999);
                ds.send(packet);
                //接收
                byte[] read=new byte[1024];
                DatagramPacket in=new DatagramPacket(read,read.length,InetAddress.getByName("localhost"),9999);
                ds.receive(in);
                int i=in.getLength();
                java.lang.String s=new java.lang.String(in.getData(),0,in.getLength());
                System.out.println("老师说: "+s);
            }





            ds.close();

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
