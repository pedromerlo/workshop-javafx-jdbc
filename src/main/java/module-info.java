module com.pedro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.pedro to javafx.fxml;
    opens com.pedro.gui to javafx.fxml;
    opens com.pedro.model.services to javafx.fxml;
    
    exports com.pedro;
    exports com.pedro.db;
    exports com.pedro.model.dao;
    exports com.pedro.model.dao.impl;
    exports com.pedro.model.entities;
}
