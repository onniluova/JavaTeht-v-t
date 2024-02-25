module JavaTehtavat {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    opens src.Moduuli6.View to javafx.graphics, javafx.fxml;
}