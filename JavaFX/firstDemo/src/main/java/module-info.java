module com.example.firstdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstdemo to javafx.fxml;
    exports com.example.firstdemo;
}