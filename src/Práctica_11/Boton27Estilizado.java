package Práctica_11;

import javafx.scene.control.Button;

public class Boton27Estilizado extends Button {
    public Boton27Estilizado() {
        super();
        aplicarEstilo();
    }

    public Boton27Estilizado(String texto) {
        super(texto);
        aplicarEstilo();
    }

    private void aplicarEstilo() {
        this.getStyleClass().add("button-personalizado");
    }
}