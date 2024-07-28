module com.pedro {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pedro to javafx.fxml;
    opens com.pedro.gui to javafx.fxml;
    
    exports com.pedro;
}
