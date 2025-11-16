package Práctica_11;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormularioEstudianteController {

    @FXML
    private TextField txtMatricula;
    @FXML
    private Label lblErrorMatricula;

    @FXML
    private TextField txtNombre;
    @FXML
    private Label lblErrorNombre;

    @FXML
    private TextField txtCarrera;

    @FXML
    private TextField txtSemestre;
    @FXML
    private Label lblErrorSemestre;

    @FXML
    private void initialize() {

        txtNombre.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == null || newValue.trim().isEmpty()) {
                lblErrorNombre.setText("El nombre no puede estar vacío");
                lblErrorNombre.setVisible(true);
            } else {
                lblErrorNombre.setVisible(false);
            }
        });

        txtMatricula.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue == null || newValue.trim().isEmpty()) {
                lblErrorMatricula.setText("La matrícula no puede estar vacía");
                lblErrorMatricula.setVisible(true);
            } else {
                lblErrorMatricula.setVisible(false);
            }
        });

        txtSemestre.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                lblErrorSemestre.setText("Solo se permiten números");
                lblErrorSemestre.setVisible(true);
            } else {
                lblErrorSemestre.setVisible(false);
            }
        });
    }

    @FXML
    private void handleGuardar() {
        boolean esValido = !lblErrorNombre.isVisible() && !txtNombre.getText().isEmpty()
                && !lblErrorSemestre.isVisible() && !txtSemestre.getText().isEmpty()
                && !lblErrorMatricula.isVisible() && !txtMatricula.getText().isEmpty();

        if (esValido) {

            this.nuevoEstudiante = new Estudiante(
                    txtMatricula.getText(),
                    txtNombre.getText(),
                    txtCarrera.getText(),
                    txtSemestre.getText()
            );

            isOkClicked = true;

            Alert alertaExito = new Alert(Alert.AlertType.INFORMATION);
            alertaExito.setTitle("Éxito");
            alertaExito.setHeaderText("Estudiante Guardado");
            alertaExito.setContentText("El estudiante " + txtNombre.getText() + " ha sido guardado.");
            alertaExito.showAndWait();

            dialogStage.close();

        } else {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Validación");
            alertaError.setHeaderText("Campos inválidos");
            alertaError.setContentText("Por favor, corrige los campos con errores.");
            alertaError.showAndWait();
        }
    }

    private Stage dialogStage;
    private Estudiante nuevoEstudiante;
    private boolean isOkClicked = false;

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public Estudiante getNuevoEstudiante() {
        return nuevoEstudiante;
    }

    public boolean isOkClicked() {
        return isOkClicked;
    }
}