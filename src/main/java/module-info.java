module com.example.expressionevaluatorandconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens Apllication to javafx.fxml;
    exports Apllication;
}