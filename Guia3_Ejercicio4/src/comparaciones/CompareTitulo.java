package comparaciones;

import java.util.Comparator;
import sistema.Pelicula;

/**
 *
 * @author Sebas
 */
public class CompareTitulo implements Comparator<Pelicula>{
    
    @Override
    public int compare(Pelicula peli1, Pelicula peli2) {
        return peli1.getTitulo().compareTo(peli2.getTitulo());
    }
}
