module org.example.componentefuturo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;


    opens org.example.componentefuturo to javafx.fxml, javafx.graphics;
}