
package par_1c321.pkg20250522.francocostantino;



public abstract class Nave implements Comparable<Nave>{
private String nombre;
private int capacidadTripulacion;
private int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public void setCapacidadTripulacion(int capacidadTripulacion) {
        this.capacidadTripulacion = capacidadTripulacion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public String toString() {
        return " {" + ", nombre: " + this.nombre + ", capacidad de tripulacion: " + this.capacidadTripulacion + ", anio de lanzamiento: " + this.anioLanzamiento;
    }

@Override
public int compareTo(Nave dos){
    if (this.anioLanzamiento < dos.getAnioLanzamiento()){
        return 1;
    } else if (this.anioLanzamiento == dos.getAnioLanzamiento()){
        return 0 ;
    } else {
        return -1;
    }
}


}

