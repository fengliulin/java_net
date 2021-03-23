package url;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {



    public static void main(String[] args) {
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        URLConnection urlConnection = null;

        try {
            URL url = new URL("https://www.runoob.com"); //大网站会显示302找不到
            urlConnection = url.openConnection();

            inputStream = urlConnection.getInputStream();
            fileOutputStream = new FileOutputStream("网页.txt");

            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
                fileOutputStream.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
