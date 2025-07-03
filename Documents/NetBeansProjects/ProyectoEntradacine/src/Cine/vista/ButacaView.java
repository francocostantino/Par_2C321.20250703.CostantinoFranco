package Cine.vista;

import Cine.modelo.Butaca;
import Cine.modelo.Cine;
import Cine.modelo.Cliente;
import Cine.modelo.Entrada;
import Cine.modelo.Sala;
import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ButacaView extends VBox {

    private Butaca butacaSeleccionada = null;
    private Sala sala;

    public ButacaView(Stage stage, Cliente cliente, HashMap<String, Cliente> clientes, Cine cine, Sala sala) {
        this.sala = sala;

        setSpacing(20);
        setPadding(new javafx.geometry.Insets(20));

        GridPane grilla = new GridPane();
        grilla.setVgap(5);
        grilla.setHgap(10);

        //recorrer butacas
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 6; col++) {
                Butaca b = sala.getButacas()[fila][col];
                Button btn = new Button(b.isOcupada() ? "x" : " ");
                btn.setMinWidth(40);
                btn.setMinHeight(40);
                
                if (b.isOcupada()) {
                    btn.setDisable(true);
                } else {
                    btn.setOnAction(e -> {
                        butacaSeleccionada = b;

                    });
                }
                grilla.add(btn, col, fila);
            }
        }

        Button btnConfirmar = new Button("confirmar compra");
        Button btnVolver = new Button("Volver");

        btnConfirmar.setOnAction(e -> {
            if (butacaSeleccionada != null) {
                butacaSeleccionada.setOcupada(true);
                Alert alerta = new Alert(Alert.AlertType.INFORMATION, "compra confirmada en fila: " + (butacaSeleccionada.getFila() + 1) + ", columna: " + (butacaSeleccionada.getColumna() + 1));

                alerta.showAndWait();
                //volver al menu
                SalaView salaView = new SalaView(stage, cliente, clientes, cine);
                stage.setScene((new Scene(salaView)));
            } else {
                Alert alerta = new Alert(Alert.AlertType.WARNING, "seleccione una butaca primero");
                alerta.showAndWait();

            }
        });

        btnVolver.setOnAction(e -> {
            SalaView salaView = new SalaView(stage, cliente, clientes, cine);
            stage.setScene(new Scene(salaView));
        });

        getChildren().addAll(grilla, btnConfirmar, btnVolver);
    }

}
