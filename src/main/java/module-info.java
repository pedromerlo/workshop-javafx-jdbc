module com.pedro {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pedro to javafx.fxml;
    opens com.pedro.gui to javafx.fxml;
    opens com.pedro.model.services to javafx.fxml;
    // opens com.pedro.model.entities to javafx.fxml;
    
    exports com.pedro;
    exports com.pedro.model.entities;
}
