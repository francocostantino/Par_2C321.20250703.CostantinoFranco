
package Cine.modelo;

import java.io.Serializable;



public class Sala implements Serializable{
    private int numero;
    private String pelicula;
    private Butaca[][] butacas; 

    
    public Sala(int numero, String pelicula){
        this.numero = numero;
        this.pelicula = pelicula;
        this.butacas = new Butaca[4][6];
        
        for(int i = 0 ; i < 4; i++){
        for (int j=0 ; j < 6; j++){
            butacas[i][j]= new Butaca(i, j);
        }
        }
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public Butaca[][] getButacas() {
        return butacas;
    }

    public void setButacas(Butaca[][] butacas) {
        this.butacas = butacas;
    }
    
}
