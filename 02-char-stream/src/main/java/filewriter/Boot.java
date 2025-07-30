package filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author lixh
 * @since 2025/7/28 21:54
 */
public class Boot {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("char-stream/src/main/java/filewriter/a.txt", true);

        String str = "Hello, World!\n";

        char[] chars = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!', '\n'};

        fw.write(str);

        fw.write(chars);

        fw.close();
    }
}
