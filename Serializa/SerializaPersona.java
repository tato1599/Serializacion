package Serializa;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializaPersona {
    private static Scanner scan;
    public static void main(String[] args)  {
        Persona Nuevo01 = new Persona("Daniel Neri", "Calle 1872", "656158943");
        scan = new Scanner(System.in);
        int des;                                            
        System.out.println("1.Crear objeto\n2.Leer Objeto\n");
        des = scan.nextInt();
        switch (des) {
            case 1:
            Nuevo(Nuevo01);
                break;
        case 2:
            LeerNuevo(Nuevo01);
        break;
            default:
                break;
        }
        
    }

    private static void Nuevo(Persona nuevo) {
        
        try {
            FileOutputStream f = new FileOutputStream("C:\\Archivos/nuevo.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(nuevo);
            s.close();
        } catch (IOException e) {
            System.out.println("No se encontro la ruta especificada");
        } 
    }
    private static void LeerNuevo(Persona nuevo) {
        nuevo = null;
        
        
        try {
            FileInputStream f = new FileInputStream("C:\\Archivos/nuevo.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            nuevo = (Persona) s.readObject();
            System.out.println(nuevo);
        } catch (EOFException e) {
           System.out.println("Error");
        } catch(Exception e){
            System.out.println("Error 2");

        }
    
    } 
}
