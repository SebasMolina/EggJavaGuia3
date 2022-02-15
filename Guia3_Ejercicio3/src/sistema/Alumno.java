/*
 */
package sistema;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
        notas = new ArrayList<Integer>();
    }

    public String getNombre() {
        return nombre;
    }

    public void crearAlumno(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int unaNota;
        System.out.print("Ingrese el nombre del alumno: ");
        nombre = leer.next();
        for (int i= 0; i<3;i++){
            System.out.printf("Ingrese la %dº nota: ",i+1);
            unaNota = leer.nextInt();
            notas.add(unaNota);
        }
    }
    
    @Override
    public String toString() {
        return String.format("ALUMNO: (Nombre: %s, Notas: %d, %d, %d)", nombre,notas.get(0),notas.get(1),notas.get(2));
    }

    
/*
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.    
*/    
/*
    public double notaFinal(){
        double promedio=0;
//        Iterator <Alumno> busqueda = new ArrayList();

    }
*/    
}
