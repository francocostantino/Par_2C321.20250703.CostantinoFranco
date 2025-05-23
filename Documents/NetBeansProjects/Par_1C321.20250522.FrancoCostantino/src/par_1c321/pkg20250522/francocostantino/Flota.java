
package par_1c321.pkg20250522.francocostantino;

import java.util.ArrayList;
import java.util.List;



public class Flota {

    private List<Nave> naves;
    public Flota() {
        naves = new ArrayList<>();
    }
    
    public List<Nave> getNaves(){
        return naves;
    }
    
    public void agregarNave(Nave n){
        for (Nave na : naves) {
            if(na.getNombre().equals(n.getNombre()) && na.getAnioLanzamiento() == n.getAnioLanzamiento()){
                System.out.println("no se puede agergar la nave devido a que ya existe una con el mismo año y nombre.");
                return;
            }
        }
    naves.add(n);
        System.out.println("nave agregada con exito");
    }
    
    
    public void mostrarNaves(){
        if(naves.isEmpty()){
            System.out.println("no hay naves para mostrar");
        } else {
            for(Nave na : naves){
                System.out.println(na);
            }
        }
    }
    
    
    public void iniciarExploracion(){
        if(naves.isEmpty()){
            System.out.println("no hay naves para que inicien la exploracion");
          } else {
            for (Nave na : naves){
                if (na instanceof Exploradores){
                    ((Exploradores)na).iniciarExploracion();
                } else {
                    System.out.println("los cruceros no son capaces de hacer exploraciones.");
                }
            }
        }
         
}
}
