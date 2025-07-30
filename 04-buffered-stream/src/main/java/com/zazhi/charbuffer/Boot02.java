package com.zazhi.charbuffer;

import java.io.*;

/**
 * @author lixh
 * @since 2025/7/30 21:11
 */
public class Boot02 {
    public static void main(String[] args) throws IOException {
        File source = new File("04-buffered-stream/src/main/java/com/zazhi/charbuffer/Boot02.java");
        File outFile = new File("04-buffered-stream/src/main/java/com/zazhi/charbuffer/Boot02.txt");
        BufferedReader br = new BufferedReader(new FileReader(source));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outFile));

        String line;
        while((line = br.readLine()) != null) {
            // 读取到的行
            bw.write(line);
            bw.newLine(); // 添加换行符
        }

        br.close();
        bw.close();
    }
}
