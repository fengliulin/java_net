

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            serverSocket = new ServerSocket(10001);
            accept = serverSocket.accept();
            inputStream = accept.getInputStream();
            outputStream = accept.getOutputStream();
//            outputStream.write("我爱短发短发短发".getBytes(StandardCharsets.UTF_8));

            byte[] buf = new byte[1024];
            int len;
            while ((len = inputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
                accept.close();
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
