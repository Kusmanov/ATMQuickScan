package kz.bs2.atmquickscan;

import kz.bs2.atmquickscan.services.*;
import kz.bs2.atmquickscan.model.Scod;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    private static Stage aboutWindowStage;
    private static File rootDirFile;
    @FXML
    private TextArea errorDescriptionTextArea;
    @FXML
    private Label wrongDirectoryLabel;
    @FXML
    private Label currentDirectoryLabel;
    @FXML
    private TableView<Scod> scodTable;
    @FXML
    private TableColumn<Scod, Integer> idColumn;
    @FXML
    private TableColumn<Scod, Integer> cashInColumn;
    @FXML
    private TableColumn<Scod, Integer> cashOutColumn;
    @FXML
    private TableColumn<Scod, String> dateColumn;
    @FXML
    private TableColumn<Scod, String> groupColumn;
    @FXML
    private TableColumn<Scod, String> timeColumn;
    @FXML
    private ListView<String> logFileListView;
    @FXML
    private ListView<String> journalFileListView;

    @FXML
    private void onFolderSelectMenuItemClick() {
        logFileListView.getItems().clear();
        scodTable.getItems().clear();
        errorDescriptionTextArea.setText("");
        currentDirectoryLabel.setText("");
        wrongDirectoryLabel.setText("");

        DirectoryChooser directoryChooser = new DirectoryChooser();
        rootDirFile = directoryChooser.showDialog(new Stage());
        currentDirectoryLabel.setText(rootDirFile.getAbsolutePath());

        File logDir = new File(rootDirFile.getAbsolutePath() + "\\PROBASE\\LOG");
        File journalDir = new File(rootDirFile.getAbsolutePath() + "\\JOURNAL");
        String[] splitDir = rootDirFile.toString().split("\\\\");

        if (splitDir[splitDir.length - 1].equals("SUPPORT") && logDir.isDirectory() && journalDir.isDirectory()) {
            ScanLogFiles.execute(idColumn, cashInColumn, cashOutColumn, dateColumn, groupColumn, timeColumn, scodTable, logDir);
        } else {
            wrongDirectoryLabel.setText("CHECK THAT ALL PATHS ARE CORRECT");
        }
    }

    @FXML
    private void onTableViewLineClick() {
        OpenLogFile.execute(logFileListView, scodTable);
        OpenJournalFile.execute(journalFileListView, scodTable, rootDirFile);
        ShowErrorDescription.execute(errorDescriptionTextArea, scodTable);
    }

    @FXML
    private void onQuitMenuItemClick() {
        Platform.exit();
    }

    @FXML
    private void onAboutMenuItemClick() {
        if (aboutWindowStage != null) {
            aboutWindowStage.close();
        }
        aboutWindowStage = ShowAboutInfo.execute();
    }

    @FXML
    private void onCCDMDocClick() {
        OpenDoc.execute("CCDM.pdf");
    }

    @FXML
    private void onCCDMRUSDocClick() {
        OpenDoc.execute("CCDM(RUS).pdf");
    }

    @FXML
    private void onCMDv4DocClick() {
        OpenDoc.execute("CMDv4.pdf");
    }

    @FXML
    private void onCMDv4RUSDocClick() {
        OpenDoc.execute("CMDv4(RUS).pdf");
    }

}
