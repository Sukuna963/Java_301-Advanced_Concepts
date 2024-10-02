package org.example.io.character;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter =
                     new BufferedWriter(new FileWriter("D:\\Java_Advanced\\src\\main\\java\\org\\example\\io\\character\\output.txt"))
        ) {
            String data = "Hello, Try-With-Resource";

            bufferedWriter.write(data);

        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
