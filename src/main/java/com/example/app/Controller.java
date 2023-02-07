package com.example.app;

import com.example.app.services.OpenLogFile;
import com.example.app.services.ScanLogFiles;
import com.example.app.services.ShowAboutInfo;
import com.example.app.model.Scod;
import com.example.app.services.ShowErrorDescription;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller {
    private static Stage aboutWindow;
    @FXML
    public TextArea errorDescriptionTextArea;
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
    private void onSelectMenuItemClick() {
        logFileListView.getItems().clear();
        errorDescriptionTextArea.setText("");
        ScanLogFiles.execute(idColumn, cashInColumn, cashOutColumn, dateColumn, groupColumn, timeColumn, scodTable);
    }

    @FXML
    private void onTableViewLineClick() {
        OpenLogFile.execute(logFileListView, scodTable);
        ShowErrorDescription.execute(errorDescriptionTextArea, scodTable);
    }

    @FXML
    private void onQuitMenuItemClick() {
        Platform.exit();
    }

    @FXML
    private void onAboutMenuItemClick() {
        if (aboutWindow != null) {
            aboutWindow.close();
        }
        aboutWindow = ShowAboutInfo.execute();
    }
}
