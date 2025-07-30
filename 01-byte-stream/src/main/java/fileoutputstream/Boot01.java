package fileoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author lixh
 * @since 2025/7/27 19:07
 */
public class Boot01 {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个字节输出流对象
        // - 参数可以传 File 或者 String
        // - 创建输出流对象会在指定路径创建一个文件，如果文件已存在，则会覆盖原有内容
        // - 文件可以不存在，但父级目录必须存在
        FileOutputStream fos = new FileOutputStream("byte-stream/src/main/java/fileoutputstream/a.txt");

        // 2. 写入数据
        // - 传入整数，实际写入的是整数对应的 ASCII 字符
        fos.write(97);

        // 3. 释放资源
        fos.close();
    }
}
