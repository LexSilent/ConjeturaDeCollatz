module com.example.tresxmasuno {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tresxmasuno to javafx.fxml;
    exports com.example.tresxmasuno;
}