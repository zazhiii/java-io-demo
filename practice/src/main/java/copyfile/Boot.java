package copyfile;

import java.io.*;

/**
 * @author lixh
 * @since 2025/7/28 22:34
 */
@SuppressWarnings("all")
public class Boot {
    public static void main(String[] args) throws IOException {
        String sourcePath = "practice/src/main/java/copyfile/source";
        String targetPath = "practice/src/main/java/copyfile/target";

        copyFile(new File(sourcePath), new File(targetPath));
    }

    private static void copyFile(File source, File target) throws IOException {
        target.mkdirs();

        File[] files = source.listFiles();

        for(File file : files) {
            if (file.isFile()) {
                InputStream fis = new FileInputStream(file);
                OutputStream fos = new FileOutputStream(new File(target, file.getName()));
                int len;
                byte[] buffer = new byte[1024];
                while((len = fis.read(buffer)) != -1){
                    fos.write(buffer, 0, len);
                }
                fis.close();
                fos.close();
            } else if (file.isDirectory()) {
                copyFile(file, new File(target, file.getName())); // 递归复制子目录
            }
        }

    }
}
