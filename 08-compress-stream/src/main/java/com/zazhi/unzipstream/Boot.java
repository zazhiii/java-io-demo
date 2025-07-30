package com.zazhi.unzipstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author lixh
 * @since 2025/7/30 22:15
 */
public class Boot {
    public static void main(String[] args) throws IOException {
        File file = new File("08-compress-stream/src/main/java/com/zazhi/unzipstream/A.zip");
        File outDir = new File("08-compress-stream/src/main/java/com/zazhi/unzipstream");

        ZipInputStream zip = new ZipInputStream(new FileInputStream(file));

        ZipEntry entry;
        while((entry = zip.getNextEntry()) != null) {
            String entryName = entry.getName();
            // 跳过 __MACOSX 目录和隐藏文件（如 .DS_Store 或 .开头的文件）
            if (entryName.startsWith("__MACOSX") || entryName.startsWith(".")) {
                zip.closeEntry();
                continue;
            }
            File outFile = new File(outDir, entryName);
            if (entry.isDirectory()) {
                outFile.mkdirs();
            } else {
                // 确保父目录存在
                outFile.getParentFile().mkdirs();
                FileOutputStream out = new FileOutputStream(outFile);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = zip.read(buffer)) != -1) {
                    out.write(buffer, 0, len);
                }
                out.close();
            }
            zip.closeEntry();
        }
        zip.close();
    }
}
