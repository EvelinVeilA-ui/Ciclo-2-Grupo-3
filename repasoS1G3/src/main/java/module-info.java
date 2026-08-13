module pe.edu.upeu.repasos1g3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.repasos1g3 to javafx.fxml;
    exports pe.edu.upeu.repasos1g3;
}