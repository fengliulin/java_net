package tcp;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {

    public static void main(String[] args) throws Exception{
        //要知道服务器的地址
        InetAddress serverIP = InetAddress.getByName("127.0.0.1");
        System.out.println(serverIP);
        //端口号
        int port = 9999;
        //创建一个socket连接
        Socket socket = new Socket(serverIP, port);
        //发送消息 io流
        OutputStream os = socket.getOutputStream();
        os.write("你好，欢迎学习java".getBytes());
        os.flush();
        os.close();
        socket.close();


    }
}
