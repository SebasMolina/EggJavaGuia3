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

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return String.format("ALUMNO: (Nombre: %s, Notas: %d, %d, %d)", nombre,notas.get(0),notas.get(1),notas.get(2));
    }

}
