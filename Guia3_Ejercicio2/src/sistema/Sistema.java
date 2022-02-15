/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
*/
package sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Sistema {

    public static void main(String[] args) {
        // Ejercicio 2
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String termino="",raza,perro;
        ArrayList<String> razaPerros = new ArrayList<String>();
        do {
            System.out.print("Ingrese una raza de perro: ");
            raza = leer.next();
            razaPerros.add(raza);
            System.out.print("Quiere agregar otra raza? Y/N ");
            termino = leer.next();
        } while (termino.equalsIgnoreCase("y"));
        System.out.println("---------------------------");
        imprimirArrayList(razaPerros);
        do {
            System.out.print("¿Desea eliminar una raza de perro? ingrese el nombre: ");
            perro = leer.next();
            eliminarElemento(razaPerros, perro);
            System.out.print("Desea eliminar otro? Y/N ");
            termino = leer.next();
        } while(termino.equalsIgnoreCase("y"));
        imprimirArrayList(razaPerros);
    }
    
    public static void imprimirArrayList(ArrayList<String> array){
        Iterator iterator = array.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
    
    public static void eliminarElemento(ArrayList<String> array, String perro){
        Iterator iterator = array.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals(perro)){
                iterator.remove();
            }
        }
        Collections.sort(array);
    }
}