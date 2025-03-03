module com.example.layoutsdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.layoutsdemo to javafx.fxml;
    exports com.example.layoutsdemo;
}