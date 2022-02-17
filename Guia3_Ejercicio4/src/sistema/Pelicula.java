/*

*/
package sistema;

import java.util.Comparator;

/**
 *
 * @author Sebas
 */
public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return String.format("Pelicula: (Titulo: %s, Director: %s, Duracion, %s)", titulo,director,duracion);
    }

}
