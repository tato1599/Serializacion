/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author 701
 */
public class SerializaAlumno {
    public SerializaAlumno(){
        Alumno Daniel = new Alumno(2111240,"Daniel");
        try{
            FileOutputStream f = new FileOutputStream("C:\\Users/701/Desktop/ejemplo.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(Daniel);
            s.close();
        }catch(IOException e){
            
        }
    }
    public static void main(String[] args) {
        
    }
}
