package sistema;

/**
 *
 * @author Sebas
 */
public class Paises {
    private String nombre;

    public Paises() {
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("Pais: (Nombre: %s",nombre);
    }
    
    
    
}
