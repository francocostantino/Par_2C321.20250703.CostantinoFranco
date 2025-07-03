
package Cine.vista;


import Cine.modelo.Cine;
import Cine.modelo.Cliente;
import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginView extends VBox{

public LoginView(Stage stage, HashMap<String, Cliente> clientes, Cine cine){
        setSpacing(10);
        setPadding(new javafx.geometry.Insets(20));
        
        Label lblEmail = new Label("Email: ");
        TextField campoUsuario = new TextField();
        
        Label lblContraseña = new Label("Contraseña");
        PasswordField campoPassword = new PasswordField();
        
        Button btnRegistrarse = new Button ("Registrarse");
        Label lblMensaje = new Label();
        
        btnRegistrarse.setOnAction(e ->{
            String email = campoUsuario.getText();
            String password = campoPassword.getText();
            
            Cliente cliente = clientes.get(email);
            
            // Validación
            if(cliente != null && cliente.getContraseña().equals(password)){
                SalaView salaView = new SalaView(stage, cliente, clientes, cine);
                stage.setScene(new Scene(salaView));
            }else {
                lblMensaje.setText("Email o contraseña incorrectos");
            }
        });
        getChildren().addAll(lblEmail, campoUsuario, lblContraseña, campoPassword, btnRegistrarse, lblMensaje);
    }
}
