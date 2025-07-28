package copyfile;

import java.io.*;

/**
 * @author lixh
 * @since 2025/7/27 22:51
 */
@SuppressWarnings("all")
public class Boot02 {
    /*
        文件读写改进
     */
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("byte-stream/src/main/java/copyfile/a.txt");
        OutputStream fos = new FileOutputStream("byte-stream/src/main/java/copyfile/b.txt");

        int len;
        byte[] buf = new byte[1024 * 1024 * 5];
        while((len = fis.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }

        fis.close();
        fos.close();

    }
}
