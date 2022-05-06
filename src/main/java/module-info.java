module com.javafx.projectjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx.projectjavafxjdbc to javafx.fxml;
    exports com.javafx.projectjavafxjdbc;
}