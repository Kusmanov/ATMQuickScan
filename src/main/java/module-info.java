module kz.bs2.atmquickscan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens kz.bs2.atmquickscan to javafx.fxml;
    exports kz.bs2.atmquickscan;
}