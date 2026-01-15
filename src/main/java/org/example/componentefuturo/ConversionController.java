package org.example.componentefuturo;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.Duration;

public class ConversionController {

    @FXML private TextField txtEuros;
    @FXML private Label txtResultado;
    @FXML private Button btnConvertir;

    private double dolares = 1.17;

    @FXML
    public void initialize() {
        btnConvertir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ConversionController.this.conversion();
            }
        });
    }

    @FXML
    private void conversion() {
        try {
            String texto = txtEuros.getText();
            double euros = Double.parseDouble(texto);
            double totalDolares = euros * dolares;

            totalDolares = Math.round(totalDolares * 100.0) / 100.0;
            txtResultado.setText(String.valueOf(totalDolares));

            FadeTransition fade = new FadeTransition(Duration.millis(600), txtResultado);
            fade.setFromValue(0.0);
            fade.setToValue(1.0);
            fade.play();

        } catch (NumberFormatException e) {
            txtResultado.setText("Error realizando la conversión");
        }
    }

    public double getEuros() {
        try {
            return Double.parseDouble(txtEuros.getText());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    public void setTasaCambio(double nuevaTasa) {
        dolares = nuevaTasa;
    }

    public void setEuros(double euros) {
        txtEuros.setText(String.valueOf(euros));
    }

    public double conversion(double euros) {
        return Math.round((euros * dolares) * 100.0) / 100.0;
    }
}