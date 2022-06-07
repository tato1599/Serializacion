/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author 701
 */
public class DesSerializaAlumno {

    public DesSerializaAlumno() throws FileNotFoundException {
        Alumno Temp = null;
        try {
            FileInputStream f = new FileInputStream("C:\\Users/701/Desktop/ejemplo.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            int i = 0;
            try{
                Temp =(Alumno) s.readObject();
                System.out.println(" " + Temp);
            }catch(EOFException e){
                System.out.println("proceso terminado");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
       new DesSerializaAlumno(); 
    }
}
