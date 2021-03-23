package tcp;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);

        //等待客户端连接过来
        Socket accept = serverSocket.accept();

        //读取客户端的消息
        /*InputStream is = accept.getInputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer)) != -1) {
            String msg = new String(buffer, 0, len);
            System.out.println(msg);
        }*/

        //管道流，使用的内存ByteArrayOutputStream
        InputStream is = accept.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer)) != -1) {
            baos.write(buffer, 0, len);
            baos.flush();
        }
        System.out.println(new String(baos.toByteArray()));
        baos.close();
        is.close();
        accept.close();
        serverSocket.close();
    }
}
