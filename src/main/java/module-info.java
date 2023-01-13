module com.example.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.app to javafx.fxml;
    exports com.example.app;
    exports com.example.app.services;
    opens com.example.app.services to javafx.fxml;
    exports com.example.app.objects;
    opens com.example.app.objects to javafx.fxml;
}