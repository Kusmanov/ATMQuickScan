package kz.bs2.atmquickscan.services;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class ShowAboutInfo {
    public static Stage execute() {
        //Create Stage
        Stage stage = new Stage();
        stage.setTitle("About");
        //Create view in Java
        Label title = new Label("""
                Version: 2 (2023-04-25)
                Company: BS/2 Kazakhstan
                Reference: CMD-V4 service manual (2014) and CCDM service manual (2005)
                
                ATMQuickScan allows you to quickly scan ATM logs and analyze errors""");
        VBox container = new VBox(title);
        //Style title
        title.setTextAlignment(TextAlignment.CENTER);
        //Style container
        container.setPadding(new Insets(50));
        container.setAlignment(Pos.CENTER);
        //Set view in stage
        stage.setScene(new Scene(container));
        //Launch
        stage.show();

        return stage;
    }
}