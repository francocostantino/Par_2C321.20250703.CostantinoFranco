
package Cine.vista;

import Cine.modelo.Cine;
import Cine.modelo.Cliente;
import Cine.modelo.Sala;
import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class SalaView extends VBox{
    private Cine cine;
    
    
    public SalaView(Stage stage, Cliente cliente, HashMap<String, Cliente> clientes, Cine cine){
        this.cine = cine;
        
    setSpacing(15);
    setPadding(new javafx.geometry.Insets(20));
    
    Label lblBienvenida = new Label ("bienvenido " + cliente.getNombre());
        getChildren().add(lblBienvenida);
        
    for( Sala s : cine.getSalas()){
        String textoboton = "sala" + s.getNumero() + " - peliucla: " + s.getPelicula();
        Button btnSala = new Button(textoboton);
        
        btnSala.setOnAction(e ->{
            ButacaView butacaView = new ButacaView(stage, cliente, clientes, cine, s);
            stage.setScene(new Scene(butacaView));
        });
        getChildren().add(btnSala);
    }
        
        
        Button btnSalir = new Button ("cerrar sesion");
    
        
        btnSalir.setOnAction(e->{
        LoginView login = new LoginView(stage, clientes, cine);
        stage.setScene(new Scene(login));
        });
        
        getChildren().addAll( btnSalir);
    }
}
