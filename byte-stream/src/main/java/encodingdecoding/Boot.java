package encodingdecoding;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * @author lixh
 * @since 2025/7/28 21:19
 */
public class Boot {
    /*
        编码：
            public byte[] getBytes()
            public byte[] getBytes(String charsetName)
        解码：
            String(byte[] bytes)
            String(byte[] bytes, String charsetName)
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "abc";

        // 默认编码解码
        byte[] data = str.getBytes();
        String res = new String(data);
        System.out.println(res);

        // 指定编码解码
        byte[] data2 = str.getBytes(StandardCharsets.UTF_8);
        String res2 = new String(data2, StandardCharsets.UTF_8);
        System.out.println(res2);

        // 编码和解码使用不同的字符集
        byte[] data3 = str.getBytes(StandardCharsets.UTF_16);
        String res3 = new String(data3, StandardCharsets.UTF_8);
        System.out.println(res3); // 输出乱码，因为编码和解码使用了不同的字符集
    }
}
