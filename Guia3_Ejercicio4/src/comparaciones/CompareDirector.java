package comparaciones;

import java.util.Comparator;
import sistema.Pelicula;

/**
 *
 * @author Sebas
 */
public class CompareDirector implements Comparator<Pelicula>{

    @Override
    public int compare(Pelicula peli1, Pelicula peli2) {
        return peli1.getDirector().compareTo(peli2.getDirector());
    }
    
}
