
package RazasdePerros.entidad;

import java.util.Objects;
import java.util.logging.Logger;

public class Raza {
    
    
    private String nombre;
    private String raza;

    public Raza() {
    }

    public Raza(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public Raza(String raza) {
        this.raza = raza;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public String toString() {
        return "Raza{" + "nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    
    
    
    
    
}
