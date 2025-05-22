
package par_1c321.pkg20250522.francocostantino;

import java.util.Comparator;



public class ComparadorNombre implements Comparator<Nave>{
    @Override
    public int compare(Nave uno, Nave dos){
        return uno.getNombre().compareToIgnoreCase(dos.getNombre());
    }

   
}
