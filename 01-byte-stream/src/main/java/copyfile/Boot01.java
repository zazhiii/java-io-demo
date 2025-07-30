package copyfile;

import java.io.*;

/**
 * @author lixh
 * @since 2025/7/27 22:14
 */
@SuppressWarnings("all")
public class Boot01 {
    /*
        文件拷贝
     */
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("byte-stream/src/main/java/copyfile/a.txt");
        OutputStream fos = new FileOutputStream("byte-stream/src/main/java/copyfile/b.txt");

        int d;
        while((d = fis.read()) != -1) {
            fos.write(d);
        }

        fis.close();
        fos.close();

    }
}
