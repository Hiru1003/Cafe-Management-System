module com.example.cafeshopmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.cafeshopmanagementsystem to javafx.fxml;
    exports com.example.cafeshopmanagementsystem;
}