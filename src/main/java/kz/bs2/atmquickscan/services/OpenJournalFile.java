package kz.bs2.atmquickscan.services;

import kz.bs2.atmquickscan.model.Scod;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class OpenJournalFile {
    public static void execute(ListView<String> journalFileListView, TableView<Scod> scodTable, File rootDirFile) {
        TableView.TableViewSelectionModel<Scod> sm = scodTable.getSelectionModel();
        ObservableList<Scod> tableViewOL = sm.getSelectedItems();

        String selectedScodDate = tableViewOL.get(0).getDate();

        if (!tableViewOL.isEmpty()) {
            String[] strs = selectedScodDate.split("-");
            StringBuilder fileName = new StringBuilder();
            for (String str : strs) {
                fileName.append(str);
            }
            fileName.append(".jrn");
            Path path = Path.of(rootDirFile + "\\JOURNAL\\" + fileName);

            ObservableList<String> journalFileOL = FXCollections.observableArrayList();

            try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                String currentLine;
                while ((currentLine = reader.readLine()) != null) {
                    journalFileOL.add(currentLine);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            journalFileListView.setItems(journalFileOL);
        }
    }
}
