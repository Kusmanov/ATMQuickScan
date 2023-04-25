package kz.bs2.atmquickscan.services;

import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;

public class OpenDoc {
    public static void execute(String filename) {
        try {
            // Получаем директорию, где лежит JAR-файл
            File jarDir = new File(
                    OpenDoc.class.getProtectionDomain()
                            .getCodeSource()
                            .getLocation()
                            .toURI()
                            .getPath())
                    .getParentFile().getParentFile();

            File file = new File(jarDir +
                    File.separator + "src" +
                    File.separator + "main" +
                    File.separator + "resources" +
                    File.separator + filename);
            // Получаем InputStream для файла в папке resources
            InputStream inputStream = new FileInputStream(file);

            // Создаем OutputStream для файла в директории с JAR-файлом
            File outputFile = new File(jarDir, filename);
            OutputStream outputStream = new FileOutputStream(outputFile);

            // Копируем файл
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            // Закрываем потоки
            inputStream.close();
            outputStream.close();

            // Открываем файл программой по умолчанию
            Desktop.getDesktop().open(new File(jarDir, filename));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }


    }
}