/*

*/
package sistema;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class AlumnoService {
        
    private ArrayList<Alumno> lista;

    public AlumnoService() {
        lista = new ArrayList<Alumno>();
    }
    
    public void pedirInformacion(){
        String nombre;
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int unaNota;
        System.out.print("Ingrese el nombre del alumno: ");
        nombre = leer.next();
        for (int i= 0; i<3;i++){
            System.out.printf("Ingrese la %dº nota: ",i+1);
            unaNota = leer.nextInt();
            notas.add(unaNota);
        }
        crearAlumno(nombre,notas);
    }
    
    public void crearAlumno(String nombre, ArrayList<Integer> notas){
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setNotas(notas);
        agregarAlumno(alumno);
    } 
        
    public void agregarAlumno(Alumno alumno){
        lista.add(alumno);
    }
    
    public void imprimirLista(){
        for (Alumno alumno: lista){
            System.out.println(alumno);
        }
    }
    
    public Alumno buscarAlumno(String nombreAlumno){
        Alumno alumno= null;
        for (Alumno unAlumno: lista){
            if (unAlumno.getNombre().equalsIgnoreCase(nombreAlumno)){
                alumno = unAlumno;
                break;
            }
        }
        return alumno;
    }
    
    public Alumno encontrarNombre(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.print("Ingrese el nombre del alumno que desea buscar: ");
        String nombre = leer.next();
        Alumno alumno = buscarAlumno(nombre);
        
        if (alumno != null){
            System.out.printf("%s | Nota final: %.2f ",alumno.toString(),obtenerNotafinal(alumno));
        } else {
            System.out.println("No existe el alumno con el nombre ingresado");
        }
        return alumno;
    }
    
    public double obtenerNotafinal(Alumno alumno){
        int resultado=0;

        for (int nota : alumno.getNotas()) {
            resultado += nota;
        }
        return (double) resultado/alumno.getNotas().size();      

    }
}
