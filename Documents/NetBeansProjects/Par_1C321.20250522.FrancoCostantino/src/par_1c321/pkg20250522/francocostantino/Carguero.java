
package par_1c321.pkg20250522.francocostantino;



public class Carguero extends Nave implements Exploradores{
private int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }

public void cargar(int kilos){
    if(kilos<100){
        System.out.println("la carga minima es de 100 toneladas, se establecera carga automatica");
        this.capacidadCarga = 100;
    } else if(kilos > 500){
        System.out.println("carga maxima de 500 toneladas.");
        this.capacidadCarga = 500;
        
    } else{
        this.capacidadCarga = kilos;
    }
}

@Override
   public void iniciarExploracion(){
       System.out.println("comenzando la xploracion");
   }
@Override
    public String toString() {
        return "Carguero " + super.toString() + " capacidad de carga: " + this.capacidadCarga ;
    }

}
