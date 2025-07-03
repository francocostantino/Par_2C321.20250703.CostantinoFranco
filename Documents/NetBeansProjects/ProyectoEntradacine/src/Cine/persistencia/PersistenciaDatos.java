
package Cine.persistencia;

import Cine.modelo.Cine;
import Cine.modelo.Cliente;
import Cine.modelo.Sala;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;



public class PersistenciaDatos {
    private static final String ARCHIVO = "cine.ser";
    
    public static void guardar(Cine cine) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            oos.writeObject(cine);
        } catch (IOException e) {
            System.out.println("Error guardando cine: " + e.getMessage());
        }
    }

    public static Cine cargar() {
        File archivo = new File(ARCHIVO);
        if (!archivo.exists()) {
            // si no existe creo uno nuevo
            Cine cine = new Cine();
            HashMap<String, Cliente> clientes = new HashMap<>();
            clientes.put("franco@gmail.com", new Cliente("franco", "franco@gmail.com","1234"));
            clientes.put("julieta@gmail.com", new Cliente("julieta", "julieta@gmail.com", "ssss"));
            cine.setClientes(clientes);
            
            //salas predefinidas
            ArrayList<Sala> salas = new ArrayList<>();
            salas.add(new Sala(1, "Eterno resplandor de una mente sin recuerdos"));
            salas.add(new Sala(2, "El laberinto del fauno"));
            salas.add(new Sala(3, "Empleado nocturno"));
            
            cine.setSala(salas);
            
            cine.setEntradas(new ArrayList<>());
            
            return cine;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO))) {
            return (Cine) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error cargando cine: " + e.getMessage());
            return new Cine();
        }
    }
}
