module com.example.readfilee {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.readfilee to javafx.fxml;
    exports com.example.readfilee;
}