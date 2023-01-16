package com.example.app.services;

import com.example.app.objects.Scod;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ShowErrorDescription {
    public static void execute(TextArea errorDescriptionTextArea, TableView<Scod> scodTable) {
        TableView.TableViewSelectionModel<Scod> sm = scodTable.getSelectionModel();
        ObservableList<Scod> tableViewOL = sm.getSelectedItems();

        if (!tableViewOL.isEmpty()) {
            String cashOutSCOD = tableViewOL.get(0).getCashOut();
            String cashInSCOD = tableViewOL.get(0).getCashIn();
            String cashInECOD = tableViewOL.get(0).getEcod();

            errorDescriptionTextArea.setText(getCashOutErrorDescription(cashOutSCOD, cashInSCOD, cashInECOD));
        }
    }

    private static String getCashOutErrorDescription(String cashOutSCOD, String cashInSCOD, String cashInECOD) {
        StringBuilder ErrorDescription = new StringBuilder();

        if (cashOutSCOD != null) {
            Path path = null;
            switch (cashOutSCOD) {
                case "SCOD=01" -> path = Paths.get("src/main/resources/errors/01.txt");
                case "SCOD=05" -> path = Paths.get("src/main/resources/errors/05.txt");
                case "SCOD=06" -> path = Paths.get("src/main/resources/errors/06.txt");
                case "SCOD=09" -> path = Paths.get("src/main/resources/errors/09.txt");
                case "SCOD=10" -> path = Paths.get("src/main/resources/errors/10.txt");
                case "SCOD=11" -> path = Paths.get("src/main/resources/errors/11.txt");
                case "SCOD=12" -> path = Paths.get("src/main/resources/errors/12.txt");
                case "SCOD=13" -> path = Paths.get("src/main/resources/errors/13.txt");
                case "SCOD=14" -> path = Paths.get("src/main/resources/errors/14.txt");
                case "SCOD=15" -> path = Paths.get("src/main/resources/errors/15.txt");
                case "SCOD=16" -> path = Paths.get("src/main/resources/errors/16.txt");
                case "SCOD=17" -> path = Paths.get("src/main/resources/errors/17.txt");
                case "SCOD=18" -> path = Paths.get("src/main/resources/errors/18.txt");
                case "SCOD=19" -> path = Paths.get("src/main/resources/errors/19.txt");
                case "SCOD=20" -> path = Paths.get("src/main/resources/errors/20.txt");
                case "SCOD=21" -> path = Paths.get("src/main/resources/errors/21.txt");
                case "SCOD=22" -> path = Paths.get("src/main/resources/errors/22.txt");
                case "SCOD=23" -> path = Paths.get("src/main/resources/errors/23.txt");
                case "SCOD=24" -> path = Paths.get("src/main/resources/errors/24.txt");
                case "SCOD=25" -> path = Paths.get("src/main/resources/errors/25.txt");
                case "SCOD=26" -> path = Paths.get("src/main/resources/errors/26.txt");
                case "SCOD=28" -> path = Paths.get("src/main/resources/errors/28.txt");
                case "SCOD=29" -> path = Paths.get("src/main/resources/errors/29.txt");
                case "SCOD=31", "SCOD=32", "SCOD=33", "SCOD=34", "SCOD=35", "SCOD=36"
                        -> path = Paths.get("src/main/resources/errors/3X.txt");
                case "SCOD=41", "SCOD=42", "SCOD=43", "SCOD=44", "SCOD=45", "SCOD=46"
                        -> path = Paths.get("src/main/resources/errors/4X.txt");
                case "SCOD=51", "SCOD=52", "SCOD=53", "SCOD=54", "SCOD=55", "SCOD=56"
                        -> path = Paths.get("src/main/resources/errors/5X.txt");
                case "SCOD=61", "SCOD=62", "SCOD=63", "SCOD=64", "SCOD=65", "SCOD=66"
                        -> path = Paths.get("src/main/resources/errors/6X.txt");
                case "SCOD=70" -> path = Paths.get("src/main/resources/errors/70.txt");
                case "SCOD=71", "SCOD=72", "SCOD=73", "SCOD=74", "SCOD=75", "SCOD=76"
                        -> path = Paths.get("src/main/resources/errors/7X.txt");
                case "SCOD=81", "SCOD=82", "SCOD=83", "SCOD=84", "SCOD=85", "SCOD=86"
                        -> path = Paths.get("src/main/resources/errors/8X.txt");
                case "SCOD=90" -> path = Paths.get("src/main/resources/errors/90.txt");
                case "SCOD=91" -> path = Paths.get("src/main/resources/errors/91.txt");
                case "SCOD=93" -> path = Paths.get("src/main/resources/errors/93.txt");
                case "SCOD=95" -> path = Paths.get("src/main/resources/errors/95.txt");
                case "SCOD=9A" -> path = Paths.get("src/main/resources/errors/9A.txt");
            }

            if (path != null) {
                try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                    String temp;
                    while ((temp = reader.readLine()) != null) {
                        ErrorDescription.append(temp).append("\n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else if (cashInSCOD != null && cashInECOD != null) {

        }

        return ErrorDescription.toString();
    }
}
