package com.zazhi.bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author lixh
 * @since 2025/7/30 22:03
 */
public class Boot {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("07-print-stream/src/main/java/com/zazhi/bytestream/PrintStream.txt");
        String content = "Hello, Byte Stream!";
        PrintStream ps = new PrintStream(new FileOutputStream(file));
        ps.println(content);
        ps.printf("xxx: %s, %d", content, 123);
        ps.close();
    }
}
