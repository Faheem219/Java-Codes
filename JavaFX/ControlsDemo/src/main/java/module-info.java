module com.example.controlsdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controlsdemo to javafx.fxml;
    exports com.example.controlsdemo;
}