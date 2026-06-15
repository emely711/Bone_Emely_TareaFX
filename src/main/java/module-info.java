module com.example.tarea_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea_fx to javafx.fxml;
    exports com.example.tarea_fx;
}