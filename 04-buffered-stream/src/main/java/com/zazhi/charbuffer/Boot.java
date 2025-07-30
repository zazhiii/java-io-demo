package com.zazhi.charbuffer;

import java.io.*;

/**
 * @author lixh
 * @since 2025/7/30 21:07
 */
public class Boot {
    public static void main(String[] args) throws IOException {
        File source = new File("04-buffered-stream/src/main/java/com/zazhi/charbuffer/Boot.java");
        File outFile = new File("04-buffered-stream/src/main/java/com/zazhi/charbuffer/Boot.txt");
        Reader br = new BufferedReader(new FileReader(source));
        Writer bw = new BufferedWriter(new FileWriter(outFile));

        char[] buf = new char[1024];
        while(br.read(buf) != -1) {
            // 读取到的字符
            bw.write(buf);
        }
        br.close();
        bw.close();


    }
}
