package tcp.文件传输;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Server {
    public static void main(String[] args) throws Exception {
        //创建服务
        ServerSocket serverSocket = new ServerSocket(9000);
        //监听客户端的
        Socket accept = serverSocket.accept();//阻塞式监听，会一直等待客户端连接
        SocketAddress remoteSocketAddress = accept.getRemoteSocketAddress(); //获取远程ip地址
        System.out.println(remoteSocketAddress); //return //远程ip地址和端口号
        //获取输入流
        InputStream is = accept.getInputStream();

        //文件输出
        FileOutputStream fos = new FileOutputStream(new File("receive.jpg"));
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
            fos.flush();
        }

        //通知客户端接收完毕
        OutputStream os = accept.getOutputStream();
        os.write("我接收完毕了,你可以断开了".getBytes());

        fos.close();
        is.close();
        accept.close();
        serverSocket.close();

    }
}
