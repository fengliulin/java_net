package udp.单向聊天;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceive {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);

        //准备接收包裹
        while (true){
            byte[] buffer = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
            socket.receive(datagramPacket);

            byte[] data = datagramPacket.getData();
            String receiveData = new String(data, 0, data.length);
            System.out.println(receiveData);

            if (receiveData.contains("bye")) {
                break;
            }
        }

        socket.close();
    }
}
