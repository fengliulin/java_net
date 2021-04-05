package cc.chengheng;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceive {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            while (true) {
            datagramSocket = new DatagramSocket(3000);

            byte[] buf = new byte[2048];
            DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);


                datagramSocket.receive(datagramPacket);
                byte[] data = datagramPacket.getData();
                String dataInfo = new String(data, 0, data.length);
                String address = datagramPacket.getAddress().getHostAddress() + ":" + datagramPacket.getPort();
                System.out.println(dataInfo + "； 地址" +address);
                datagramSocket.close();
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
