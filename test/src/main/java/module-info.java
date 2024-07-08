module firstscene {
    requires javafx.controls;
    requires javafx.fxml;

    opens firstscene to javafx.fxml;
    exports firstscene;
}
