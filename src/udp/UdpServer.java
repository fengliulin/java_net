package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpServer {
    public static void main(String[] args) throws Exception {
        //开放端口
        DatagramSocket socket = new DatagramSocket(9090);

        //接收输入包
        byte[] buffer = new byte[1024];

        DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);

        socket.receive(datagramPacket); //阻塞接收

        System.out.println(datagramPacket.getAddress());
        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));

        //关闭连接
        socket.close();

    }
}
