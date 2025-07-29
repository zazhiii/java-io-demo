package filereader;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author lixh
 * @since 2025/7/28 21:48
 */
public class Boot02 {
    /*
     read(char[] cbuf, int off, int len) 方法：
         - 读取字符到指定的字符数组中
         - 参数 cbuf 是字符数组，off 是起始偏移量，len 是要读取的字符数
         - 返回实际读取的字符数，如果到达文件末尾，返回 -1
     */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("char-stream/src/main/java/filereader/a.txt");

        char[] cbuf = new char[1024];
        int len;
        while((len = fr.read(cbuf)) != -1){
            String s = new String(cbuf, 0, len);
            System.out.print(s);
        }

        fr.close();
    }
}
