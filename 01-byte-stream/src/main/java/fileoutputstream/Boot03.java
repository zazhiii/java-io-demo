package fileoutputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author lixh
 * @since 2025/7/27 19:29
 */
public class Boot03 {
    /*
         1. 换行: "\r\n"
         2. 追加写入: FileOutputStream(path, true)
     */
    public static void main(String[] args) throws IOException {

        String path = "byte-stream/src/main/java/fileoutputstream/c.txt";

        OutputStream fos = new FileOutputStream(path);

        // 字符串转字节数组, 再写入
        String str = "line1";
        byte[] data = str.getBytes(); // 将字符串转换为字节数组
        fos.write(data);

        // 换行："\r\n"
        fos.write("\r\n".getBytes());

        String str2 = "line2";
        byte[] data2 = str2.getBytes(); // 将字符串转换为字节数组
        fos.write(data2);

        fos.close();

        // 追加写入
        OutputStream fos2 = new FileOutputStream(path, true);

        fos2.write("\r\nappend line".getBytes()); // 追加写入字符串

        fos2.close();
    }
}
