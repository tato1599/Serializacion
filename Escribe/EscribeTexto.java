
package Escribe;

import java.io.*;
import java.util.Scanner;

public class EscribeTexto {
    public static void main(String[] args) {
        FileWriter Archivo = null;
        PrintWriter pw = null;
        Scanner scan = new Scanner(System.in);
        String nombre;
        try {
            Archivo = new FileWriter("C:\\Archivos/Nombre.txt");
            pw = new PrintWriter(Archivo);
            System.out.println("Escriba su nombre");
            nombre = scan.nextLine();
            pw.println(nombre);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != Archivo) {
                    Archivo.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}