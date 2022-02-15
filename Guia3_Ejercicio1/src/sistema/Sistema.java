/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
*/
package sistema;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Sistema {

    public static void main(String[] args) {
        // Ejercicio 1
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String termino="",raza;
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
    }
    
    public static void imprimirArrayList(ArrayList<String> array){
        Iterator iterator = array.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
    
}
