
package par_1c321.pkg20250522.francocostantino;



public class Carguero extends Nave implements Exploradores{
private int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }



@Override
   public void iniciarExploracion(){
       System.out.println("comenzando la xploracion");
   }


}
