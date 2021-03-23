package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//不需要连接服务器
public class UdpClient {
    public static void main(String[] args) throws Exception {
        //建立一个Socket
        DatagramSocket socket = new DatagramSocket();

        //建个包
        String msg = "你好啊，服务器！";
        //发送给谁
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println(localhost);
        int port = 9090;
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, localhost, port);

        //发送包
        socket.send(datagramPacket);

        //关闭此数据报套接字。
        socket.close();
    }
}
