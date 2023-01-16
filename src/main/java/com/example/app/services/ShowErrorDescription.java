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
        Path path;

        if (cashOutSCOD != null) {
            switch (cashOutSCOD) {
                case "SCOD=01" -> path = Paths.get("src/main/resources/errors/cashout/01.txt");
                case "SCOD=05" -> path = Paths.get("src/main/resources/errors/cashout/05.txt");
                case "SCOD=06" -> path = Paths.get("src/main/resources/errors/cashout/06.txt");
                case "SCOD=09" -> path = Paths.get("src/main/resources/errors/cashout/09.txt");
                case "SCOD=10" -> path = Paths.get("src/main/resources/errors/cashout/10.txt");
                case "SCOD=11" -> path = Paths.get("src/main/resources/errors/cashout/11.txt");
                case "SCOD=12" -> path = Paths.get("src/main/resources/errors/cashout/12.txt");
                case "SCOD=13" -> path = Paths.get("src/main/resources/errors/cashout/13.txt");
                case "SCOD=14" -> path = Paths.get("src/main/resources/errors/cashout/14.txt");
                case "SCOD=15" -> path = Paths.get("src/main/resources/errors/cashout/15.txt");
                case "SCOD=16" -> path = Paths.get("src/main/resources/errors/cashout/16.txt");
                case "SCOD=17" -> path = Paths.get("src/main/resources/errors/cashout/17.txt");
                case "SCOD=18" -> path = Paths.get("src/main/resources/errors/cashout/18.txt");
                case "SCOD=19" -> path = Paths.get("src/main/resources/errors/cashout/19.txt");
                case "SCOD=20" -> path = Paths.get("src/main/resources/errors/cashout/20.txt");
                case "SCOD=21" -> path = Paths.get("src/main/resources/errors/cashout/21.txt");
                case "SCOD=22" -> path = Paths.get("src/main/resources/errors/cashout/22.txt");
                case "SCOD=23" -> path = Paths.get("src/main/resources/errors/cashout/23.txt");
                case "SCOD=24" -> path = Paths.get("src/main/resources/errors/cashout/24.txt");
                case "SCOD=25" -> path = Paths.get("src/main/resources/errors/cashout/25.txt");
                case "SCOD=26" -> path = Paths.get("src/main/resources/errors/cashout/26.txt");
                case "SCOD=28" -> path = Paths.get("src/main/resources/errors/cashout/28.txt");
                case "SCOD=29" -> path = Paths.get("src/main/resources/errors/cashout/29.txt");
                case "SCOD=31", "SCOD=32", "SCOD=33", "SCOD=34", "SCOD=35", "SCOD=36"
                        -> path = Paths.get("src/main/resources/errors/cashout/3X.txt");
                case "SCOD=41", "SCOD=42", "SCOD=43", "SCOD=44", "SCOD=45", "SCOD=46"
                        -> path = Paths.get("src/main/resources/errors/cashout/4X.txt");
                case "SCOD=51", "SCOD=52", "SCOD=53", "SCOD=54", "SCOD=55", "SCOD=56"
                        -> path = Paths.get("src/main/resources/errors/cashout/5X.txt");
                case "SCOD=61", "SCOD=62", "SCOD=63", "SCOD=64", "SCOD=65", "SCOD=66"
                        -> path = Paths.get("src/main/resources/errors/cashout/6X.txt");
                case "SCOD=70" -> path = Paths.get("src/main/resources/errors/cashout/70.txt");
                case "SCOD=71", "SCOD=72", "SCOD=73", "SCOD=74", "SCOD=75", "SCOD=76"
                        -> path = Paths.get("src/main/resources/errors/cashout/7X.txt");
                case "SCOD=81", "SCOD=82", "SCOD=83", "SCOD=84", "SCOD=85", "SCOD=86"
                        -> path = Paths.get("src/main/resources/errors/cashout/8X.txt");
                case "SCOD=90" -> path = Paths.get("src/main/resources/errors/cashout/90.txt");
                case "SCOD=91" -> path = Paths.get("src/main/resources/errors/cashout/91.txt");
                case "SCOD=93" -> path = Paths.get("src/main/resources/errors/cashout/93.txt");
                case "SCOD=95" -> path = Paths.get("src/main/resources/errors/cashout/95.txt");
                case "SCOD=9A" -> path = Paths.get("src/main/resources/errors/cashout/9A.txt");
                default -> path = Paths.get("src/main/resources/errors/cashout/none.txt");
            }

            try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                String temp;
                while ((temp = reader.readLine()) != null) {
                    ErrorDescription.append(temp).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (cashInSCOD != null && cashInECOD != null) {
            switch (cashInSCOD + "," + cashInECOD) {
                case "SCOD=01,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/010000.txt");
                case "SCOD=02,ECOD=0020" -> path = Paths.get("src/main/resources/errors/cashin/020020.txt");
                case "SCOD=05,ECOD=0001" -> path = Paths.get("src/main/resources/errors/cashin/050001.txt");
                case "SCOD=06,ECOD=0002" -> path = Paths.get("src/main/resources/errors/cashin/060002.txt");
                case "SCOD=07,ECOD=0003" -> path = Paths.get("src/main/resources/errors/cashin/070003.txt");
                case "SCOD=08,ECOD=0021" -> path = Paths.get("src/main/resources/errors/cashin/080021.txt");
                case "SCOD=09,ECOD=0024" -> path = Paths.get("src/main/resources/errors/cashin/090024.txt");
                case "SCOD=10,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/100000.txt");
                case "SCOD=11,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/110000.txt");
                case "SCOD=12,ECOD=0022" -> path = Paths.get("src/main/resources/errors/cashin/120022.txt");
                case "SCOD=13,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/130000.txt");
                case "SCOD=14,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/140000.txt");
                case "SCOD=15,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/150000.txt");
                case "SCOD=17,ECOD=0023" -> path = Paths.get("src/main/resources/errors/cashin/170023.txt");
                case "SCOD=18,ECOD=0025" -> path = Paths.get("src/main/resources/errors/cashin/180025.txt");
                case "SCOD=19,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/190000.txt");
                case "SCOD=19,ECOD=0144" -> path = Paths.get("src/main/resources/errors/cashin/190144.txt");
                case "SCOD=20,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/200000.txt");
                case "SCOD=20,ECOD=0145" -> path = Paths.get("src/main/resources/errors/cashin/200145.txt");
                case "SCOD=21,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/210000.txt");
                case "SCOD=21,ECOD=0120" -> path = Paths.get("src/main/resources/errors/cashin/210120.txt");
                case "SCOD=21,ECOD=0121" -> path = Paths.get("src/main/resources/errors/cashin/210121.txt");
                case "SCOD=21,ECOD=0122" -> path = Paths.get("src/main/resources/errors/cashin/210122.txt");
                case "SCOD=21,ECOD=0130" -> path = Paths.get("src/main/resources/errors/cashin/210130.txt");
                case "SCOD=22,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/220000.txt");
                case "SCOD=22,ECOD=0100", "SCOD=22,ECOD=0111"
                        -> path = Paths.get("src/main/resources/errors/cashin/220100.txt");
                case "SCOD=22,ECOD=0108" -> path = Paths.get("src/main/resources/errors/cashin/220108.txt");
                case "SCOD=22,ECOD=0112" -> path = Paths.get("src/main/resources/errors/cashin/220112.txt");
                case "SCOD=22,ECOD=0181" -> path = Paths.get("src/main/resources/errors/cashin/220181.txt");
                case "SCOD=24,ECOD=0000" -> path = Paths.get("src/main/resources/errors/cashin/240000.txt");
                case "SCOD=24,ECOD=0101" -> path = Paths.get("src/main/resources/errors/cashin/240101.txt");
                case "SCOD=24,ECOD=0102" -> path = Paths.get("src/main/resources/errors/cashin/240102.txt");
                case "SCOD=24,ECOD=0103", "SCOD=24,ECOD=0114"
                        -> path = Paths.get("src/main/resources/errors/cashin/240103.txt");
                case "SCOD=24,ECOD=0105", "SCOD=24,ECOD=0110", "SCOD=24,ECOD=0115"
                        -> path = Paths.get("src/main/resources/errors/cashin/240105.txt");
                case "SCOD=24,ECOD=0106" -> path = Paths.get("src/main/resources/errors/cashin/240106.txt");
                case "SCOD=24,ECOD=0113" -> path = Paths.get("src/main/resources/errors/cashin/240113.txt");
                case "SCOD=24,ECOD=0201" -> path = Paths.get("src/main/resources/errors/cashin/240201.txt");

                default -> path = Paths.get("src/main/resources/errors/cashin/none.txt");
            }

            try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                String temp;
                while ((temp = reader.readLine()) != null) {
                    ErrorDescription.append(temp).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return ErrorDescription.toString();
    }
}
