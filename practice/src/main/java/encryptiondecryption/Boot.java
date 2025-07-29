package encryptiondecryption;

import java.io.*;

/**
 * @author lixh
 * @since 2025/7/28 23:14
 */
public class Boot {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("practice/src/main/java/encryptiondecryption/a.txt");
        OutputStream fos = new FileOutputStream("practice/src/main/java/encryptiondecryption/_a.txt");

        int b;
        while((b = fis.read()) != -1){
            fos.write(b ^ 11);
        }

        fis.close();
        fos.close();

        // 直接读取加密后的文件
        System.out.println("直接读取加密后的文件内容：");
        InputStream fis2 = new FileInputStream("practice/src/main/java/encryptiondecryption/_a.txt");
        int b2;
        while((b2 = fis2.read()) != -1){
            System.out.print((char)b2);
        }
        fis2.close();

        System.out.println("\n\n解密后的内容：");
        // 解密
        InputStream fis3 = new FileInputStream("practice/src/main/java/encryptiondecryption/_a.txt");
        int b3;
        while((b3 = fis3.read()) != -1){
            System.out.print((char)(b3 ^ 11));
        }

        fis3.close();
    }
}

