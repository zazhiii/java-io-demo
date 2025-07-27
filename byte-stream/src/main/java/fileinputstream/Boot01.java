package fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lixh
 * @since 2025/7/27 19:50
 */
@SuppressWarnings("all")
public class Boot01 {
    /*
        1. 创建输出流对象
        2. read() 读取一个字节
        3. 关闭资源
     */
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("byte-stream/src/main/java/fileinputstream/a.txt");

        int d1 = fis.read();
        System.out.println(d1);

        int d2 = fis.read();
        System.out.println(d2);

        int d3 = fis.read();
        System.out.println(d3);

        // 读取到文件末尾时，read() 方法会返回 -1
        int d4 = fis.read();
        System.out.println(d4);

        fis.close();
    }
}
