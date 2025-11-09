module cmsc.shape.shape {
    requires javafx.controls;
    requires javafx.fxml;


    opens cmsc.shape.shape to javafx.fxml;
    exports cmsc.shape.shape;
}