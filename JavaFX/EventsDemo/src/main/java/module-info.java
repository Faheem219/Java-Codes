module com.example.eventsdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventsdemo to javafx.fxml;
    exports com.example.eventsdemo;
}