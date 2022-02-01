package CURSO.emtidad;

import java.util.HashSet;    
import java.util.Objects;

public class Alumno {

    private String nombre;
    private HashSet<Integer> notas;

    public Alumno(String nombre, HashSet<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public Alumno(HashSet<Integer> notas) {
        this.notas = notas;
    }

    public Alumno() {
        this.notas = new HashSet();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Integer> getNotas() {
        return notas;
    }

    public void setNotas(HashSet<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.notas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.notas, other.notas)) {
            return false;
        }
        return true;
    }

}
