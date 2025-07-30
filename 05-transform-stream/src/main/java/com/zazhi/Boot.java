package com.zazhi;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author lixh
 * @since 2025/7/30 21:24
 */
public class Boot {
    public static void main(String[] args) throws IOException {
        File file = new File("05-transform-stream/src/main/java/com/zazhi/GBK.txt");

        // ！不推荐了
//        InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "GBK");
//        int len;
//        while((len = isr.read()) != -1){
//            // 读取到的字符
//            System.out.print((char) len);
//        }
//        isr.close();

        // 🌟推荐使用
        FileReader fr = new FileReader(file, Charset.forName("GBK"));
        char[] cbuf = new char[1024];
        int readLen;
        while ((readLen = fr.read(cbuf)) != -1) {
            // 读取到的字符
            System.out.print(new String(cbuf, 0, readLen));
        }
        fr.close();

        File outFile = new File("05-transform-stream/src/main/java/com/zazhi/UTF-16.txt");
        String content = "Hello, 世界!";
        // 不推荐使用
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(outFile), StandardCharsets.UTF_16);
//        osw.write(content);
//        osw.flush();
//        osw.close();

        // 🌟推荐使用
        FileWriter fw = new FileWriter(outFile, StandardCharsets.UTF_16);
        fw.write(content);
        fw.flush();
        fw.close();
    }
}
