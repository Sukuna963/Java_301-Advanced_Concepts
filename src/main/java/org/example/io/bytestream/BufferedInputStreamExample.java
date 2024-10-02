package org.example.io.bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            inputStream = new FileInputStream("D:\\Java_Advanced\\src\\main\\java\\org\\example\\io\\bytestream\\file.txt");
            bufferedInputStream = new BufferedInputStream(inputStream);

            byte[] buffer = new byte[5];
            int bytesRead = 0;

            while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, bytesRead));
            }

        } catch (Exception exc) {
            exc.printStackTrace();

        } finally {
            try {
                inputStream.close();
                bufferedInputStream.close();
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
    }
}
