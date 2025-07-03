
package Cine.modelo;

import java.io.Serializable;



public class Entrada implements Serializable{
private Cliente cliente;
private Butaca butaca;
private Sala sala;

public Entrada(Cliente cliente,Butaca butaca){
    this.cliente = cliente;
    this.butaca = butaca;
}

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }


}

