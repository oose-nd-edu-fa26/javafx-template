module edu.nd.oose.javafx.javafxgradle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens edu.nd.oose.javafx.javafxgradle to javafx.fxml;
    exports edu.nd.oose.javafx.javafxgradle;
}