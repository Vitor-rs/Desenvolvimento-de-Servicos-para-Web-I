module com.santos.projetotreetable {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.santos.projetotreetable to javafx.fxml;
    exports com.santos.projetotreetable;
}