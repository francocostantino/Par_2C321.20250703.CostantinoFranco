package par_1c321.pkg20250522.francocostantino;

public class NaveExploracion extends Nave implements Exploradores{

    private String tipoMision;

    public NaveExploracion(String tipoMision, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

   @Override
   public void iniciarExploracion(){
       System.out.println("comenzando la xploracion");
   }
    
    
   @Override
    public String toString() {
        return "nave de exploracion " + super.toString() + ", tipo de mision: " + this.tipoMision ;
    }
}
