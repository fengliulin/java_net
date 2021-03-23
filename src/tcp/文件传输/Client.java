package tcp.文件传输;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        //创建一个Socket连接
        Socket socket = new Socket("127.0.0.1", 9000);

        //创建一个输出流
        OutputStream os = socket.getOutputStream();
        FileInputStream fis = new FileInputStream(new File("/Users/fengliulin/IdeaProjects/untitled10/src/截屏2020-09-14 下午6.19.05.png"));

        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) != -1) {
            os.write(buffer, 0, len);
            os.flush();
        }

        socket.shutdownOutput(); //通知服务器我已经传输完毕，关闭

        //确定服务器接收完毕，才能够断开连接
        InputStream inputStream = socket.getInputStream();
        InputStreamReader reader = new InputStreamReader(inputStream);
        char[] chars = new char[1024];
        int len1 = 0;
        while ((len1 = reader.read(chars)) != -1) {
            String s = new String(chars);
            System.out.println(s);
        }
        fis.close();
        os.close();
        socket.close();


    }
}
