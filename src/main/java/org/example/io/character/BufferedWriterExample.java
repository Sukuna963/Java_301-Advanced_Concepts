package org.example.io.character;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(
                    new FileWriter("D:\\Java_Advanced\\src\\main\\java\\org\\example\\io\\character\\output.txt"));

            String data = "Hello, BufferedWriter";

            bufferedWriter.write(data);

        } catch (IOException exc) {
            exc.printStackTrace();

        } finally {
            try {
                bufferedWriter.close();
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
    }
}
