module com.javafx.projectjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.javafx.projectjavafxjdbc to javafx.fxml;
    opens model.entities to javafx.base;

    exports com.javafx.projectjavafxjdbc;
    exports model.entities;
}