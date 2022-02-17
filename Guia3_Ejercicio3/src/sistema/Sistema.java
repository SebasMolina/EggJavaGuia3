/*
Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.
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
        // Ejercicio 3
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        AlumnoService listaDeAlumnos = new AlumnoService();        
        String termina="";
        Alumno unAlumno = new Alumno();
        do{
            
            listaDeAlumnos.pedirInformacion();
            System.out.print("Quiere agregar otro alumno? S/N: ");
            termina = leer.next();
        } while (termina.equalsIgnoreCase("s"));
        System.out.println("Es Hora de saber la nota final");
        termina="";
        do{
            unAlumno = listaDeAlumnos.encontrarNombre();
            System.out.print("Quiere buscar otro alumno? S/N: ");
            termina = leer.next();
        } while(termina.equalsIgnoreCase("s"));
        listaDeAlumnos.imprimirLista();
    }
    
}