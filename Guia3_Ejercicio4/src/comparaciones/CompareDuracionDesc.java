package comparaciones;

import java.util.Comparator;
import sistema.Pelicula;

/**
 *
 * @author Sebas
 */
public class CompareDuracionDesc implements Comparator<Pelicula>{
    @Override
    public int compare(Pelicula peli1, Pelicula peli2) {
        if (peli1.getDuracion() < peli2.getDuracion()){
            return -1;
        } else if (peli1.getDuracion() > peli2.getDuracion()){
            return 1;
        } else {
            return 0;
        }
    }
}
