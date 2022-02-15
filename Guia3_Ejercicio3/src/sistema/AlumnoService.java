/*

*/
package sistema;

import java.util.ArrayList;

/**
 *
 * @author Sebas
 */
public class AlumnoService {
        
    private ArrayList<Alumno> lista;

    public AlumnoService() {
        lista = new ArrayList<Alumno>();
    }
    
    public void crearAlumno(){
        Alumno alumno = new Alumno();
        alumno.crearAlumno();
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
}
