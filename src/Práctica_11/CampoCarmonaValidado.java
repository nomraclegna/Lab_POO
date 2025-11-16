package Práctica_11;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CampoCarmonaValidado extends VBox {

    private final TextField textField;
    private final Label errorLabel;

    public CampoCarmonaValidado(String promptText) {
        // Inicializar los componentes
        this.textField = new TextField();
        this.textField.setPromptText(promptText);

        this.errorLabel = new Label();
        this.errorLabel.getStyleClass().add("error-label");
        this.errorLabel.setVisible(false);

        this.getChildren().addAll(this.textField, this.errorLabel);

        this.textField.textProperty().addListener((observable, oldValue, newValue) -> {
            validar(newValue);
        });
    }

    private void validar(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            this.errorLabel.setText("Este campo no puede estar vacío.");
            this.errorLabel.setVisible(true);
            this.textField.getStyleClass().add("error-field");
        } else {
            this.errorLabel.setVisible(false);
            this.textField.getStyleClass().remove("error-field");
        }
    }

    public String getTexto() {
        return this.textField.getText();
    }

    public boolean esValido() {
        return !this.errorLabel.isVisible();
    }
}