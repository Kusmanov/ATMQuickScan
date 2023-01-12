module com.example.demofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.atmquick to javafx.fxml;
    exports com.example.atmquick;
    exports com.example.atmquick.functionality;
    opens com.example.atmquick.functionality to javafx.fxml;
    exports com.example.atmquick.objects;
    opens com.example.atmquick.objects to javafx.fxml;
}