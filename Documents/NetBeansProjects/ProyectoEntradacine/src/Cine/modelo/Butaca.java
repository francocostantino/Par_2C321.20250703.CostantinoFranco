
package Cine.modelo;

import java.io.Serializable;



public class Butaca implements Serializable{
    private int numero;
    private int fila;
    private boolean ocupada;

    public Butaca(int numero, int fila) {
        this.numero = numero;
        this.fila = fila;
        this.ocupada = false;
    }

    public int getColumna() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    
    
}
