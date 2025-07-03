package Cine.app;

import Cine.modelo.Cine;
import Cine.modelo.Cliente;
import Cine.persistencia.PersistenciaDatos;
import Cine.vista.LoginView;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//git add
//git comit
//git remote push
public class ProyectoEntradacine extends Application {
    private HashMap<String, Cliente> clientes;
    private Cine cine;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //cargar
        cine = PersistenciaDatos.cargar();
        clientes = cine.getClientes();
        
        LoginView login = new LoginView(primaryStage, clientes, cine);
        Scene escena = new Scene (login);
        
        primaryStage.setScene(escena);
        primaryStage.setTitle("cine- login");
        

        //guardar 
        primaryStage.setOnCloseRequest(e ->{ PersistenciaDatos.guardar(cine);
        });
        
        primaryStage.show();
    }

}
