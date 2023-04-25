package kz.bs2.atmquickscan.services;

import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;

public class OpenDoc {
    public static void execute(String str) {
        try {
            // открываем поток для чтения файла
            InputStream inputStream = OpenDoc.class.getResourceAsStream("/" + str);

            // создаем выходной поток для записи файла
            OutputStream outputStream = new FileOutputStream(str);

            // копируем содержимое файла
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            // закрываем потоки
            inputStream.close();
            outputStream.close();

            // Открываем файл программой по умолчанию
            File file = new File(str);
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}