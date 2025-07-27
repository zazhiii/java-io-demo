package fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author lixh
 * @since 2025/7/27 19:55
 */
@SuppressWarnings("all")
public class Boot02 {
    /*
        循环读取数据
     */
    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("byte-stream/src/main/java/fileinputstream/b.txt");

        int d;
        while((d = fis.read()) != -1){
            System.out.println((char)d);
        }

        fis.close();
    }
}
