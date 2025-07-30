package com.zazhi.charstream;

import java.io.*;

/**
 * @author lixh
 * @since 2025/7/30 22:08
 */
public class Boot {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("07-print-stream/src/main/java/com/zazhi/charstream/PrintStream.txt");
        String content = "Hello, Byte Stream!";
        PrintWriter ps = new PrintWriter(new FileOutputStream(file));
        ps.println(content);
        ps.printf("xxx: %s, %d", content, 123);
        ps.close();
    }
}
