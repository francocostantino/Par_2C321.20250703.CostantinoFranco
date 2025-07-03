
package Cine.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Cine implements Serializable{
private HashMap<String, Cliente> clientes;
private List<Sala> salas;
private List<Entrada> entradas;

public Cine(){
    clientes = new HashMap<>();
    salas = new ArrayList<>();
    entradas = new ArrayList<>();
}

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSala(List<Sala> salas) {
        this.salas = salas;
    }

    

    

    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Entrada> getEntradas(){
            return entradas;
    }
    
    public void setEntradas(List<Entrada>entradas){
        this.entradas = entradas;
    }

}
