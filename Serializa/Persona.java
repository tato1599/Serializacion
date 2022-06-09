package Serializa;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String direccion;
    private String telefono;
    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Persona [direccion=" + direccion + ", nombre=" + nombre + ", telefono=" + telefono + "]";
    }
    
}
