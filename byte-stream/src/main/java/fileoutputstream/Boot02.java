package fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lixh
 * @since 2025/7/27 19:25
 */
public class Boot02 {
    /*
      三种写入方式
      1. void write(int b)
      2. void write(byte[] b)
      3. void write(byte[] b, int off, int len)
     */
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("byte-stream/src/main/java/fileoutputstream/b.txt");

        byte[] data = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106};

        fos.write(data);

        // 换行："\r\n"
        fos.write("\r\n".getBytes());

        fos.write(data, 0, 5); // 写入前5个字节

        fos.close();

    }
}
