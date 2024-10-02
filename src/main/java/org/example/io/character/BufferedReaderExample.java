package org.example.io.character;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;

        try {
            String line;

            bufferedReader = new BufferedReader(
                    new FileReader("D:\\Java_Advanced\\src\\main\\java\\org\\example\\io\\character\\example.txt"));

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
    }
}