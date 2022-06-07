/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

import java.io.Serializable;

/**
 *
 * @author 701
 */
public class Alumno implements Serializable {
    private int numControl;
    private String nombre;

    public Alumno(int numControl, String nombre) {
        this.numControl = numControl;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numControl=" + numControl + ", nombre=" + nombre + '}';
    }
    
}
