
package par_1c321.pkg20250522.francocostantino;



public class CruceroEstelar extends Nave{
private int cantidadPasajeros;

    public CruceroEstelar(int cantidadPasajeros, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }


@Override
    public String toString() {
        return "crucero " + super.toString() + ", cantidad de pasajeros: " + this.cantidadPasajeros ;
    }

}
