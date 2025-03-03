module com.example.todolistproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.todolistproject to javafx.fxml;
    exports com.example.todolistproject;
}