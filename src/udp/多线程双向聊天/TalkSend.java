package udp.多线程双向聊天;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSend implements Runnable {
    DatagramSocket socket = null;
    BufferedReader reader = null;

    private int fromPort;
    private String toIP;
    private int toPort;

    public TalkSend(int fromPort, String toIP, int toPort) {
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;
        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }

    public TalkSend() {
    }

    @Override
    public void run() {
        //控制台读取

        while (true) {
            try {
                String data = reader.readLine();
                byte[] datas = data.getBytes();

                DatagramPacket datagramPacket =
                        new DatagramPacket(datas, 0, datas.length, new InetSocketAddress(toIP, toPort));

                socket.send(datagramPacket);

                if (data.equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        socket.close();
    }
}
