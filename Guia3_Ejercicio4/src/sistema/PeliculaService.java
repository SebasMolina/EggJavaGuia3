/*

*/
package sistema;

import comparaciones.CompareDirector;
import comparaciones.CompareDuracionAsc;
import comparaciones.CompareDuracionDesc;
import comparaciones.CompareTitulo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class PeliculaService {
    private ArrayList<Pelicula> listaPeliculas;
    private Scanner leer;

    public PeliculaService() {
        listaPeliculas = new ArrayList<>();
        leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    }
    
    public void crearPelicula(){
        Pelicula pelicula = new Pelicula();
        System.out.print("Ingrese el nombre: ");
        pelicula.setTitulo(leer.next());
        System.out.print("Ingrese el director: ");
        pelicula.setDirector(leer.next());
        System.out.print("Ingrese la duracion en minutos: ");
        pelicula.setDuracion(leer.nextInt());
        agregarPelicula(pelicula);
    }
    
    public void agregarPelicula(Pelicula pelicula){
        listaPeliculas.add(pelicula);
    }
    
    public void imprimirLista(){
        System.out.println("Peliculas");
        for (Pelicula pelicula: listaPeliculas){
            System.out.println(pelicula);
        }    
    }
    
    public void imprimirListaUnaHora(){
        System.out.println("Peliculas con duracion de mas de 1 hora");
        for (Pelicula pelicula: listaPeliculas){
            if (pelicula.getDuracion()>= 60){ 
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarPorDuracionMayorAMenor(){
        CompareDuracionAsc comparacion = new CompareDuracionAsc();
        Collections.sort(listaPeliculas, comparacion);
        imprimirLista();
    }

    public void ordenarPorDuracionMenorAMayor(){
        CompareDuracionDesc comparacion = new CompareDuracionDesc();
        Collections.sort(listaPeliculas, comparacion);
        imprimirLista();
    }
    
    public void ordenarPorTitulo(){
        CompareTitulo comparacion = new CompareTitulo();
        Collections.sort(listaPeliculas, comparacion);
        imprimirLista();
    }
    
    public void ordenarPorDirector(){
        CompareDirector comparacion = new CompareDirector();
        Collections.sort(listaPeliculas, comparacion);
        imprimirLista();

    }
}