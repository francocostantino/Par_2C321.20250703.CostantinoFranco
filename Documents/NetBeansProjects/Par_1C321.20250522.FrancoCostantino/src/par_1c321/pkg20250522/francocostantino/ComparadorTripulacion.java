package par_1c321.pkg20250522.francocostantino;

import java.util.Comparator;

public class ComparadorTripulacion implements Comparator<Nave> {

    @Override
    public int compareTo(Nave uno, Nave dos) {
        if (uno.getCapacidadTripulacion() < dos.getCapacidadTripulacion()) {
            return 1;
        } else if (uno.getCapacidadTripulacion() == dos.getCapacidadTripulacion()) {
            return 0;
        } else {
            return -1;
        }
    }
}
