package filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lixh
 * @since 2025/7/28 21:42
 */
public class Boot01 {
    /*
        无参 read() 方法：
            - 读取一个字符，返回该字符的 Unicode 码点（int 类型）
            - 如果到达文件末尾，返回 -1
     */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("char-stream/src/main/java/filereader/a.txt");

        int ch;
        while((ch = fr.read()) != -1){
            System.out.print((char) ch);
        }

        fr.close();
    }
}
