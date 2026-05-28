/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daigo
 */
import java.io.*;

public class GestorArchivo {

    public static void guardarEstado(Parqueadero parqueadero) {

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("parqueadero.dat"));

            oos.writeObject(parqueadero);

            oos.close();

            System.out.println("Estado guardado");

        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
    }

    public static Parqueadero cargarEstado() {

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("parqueadero.dat"));

            Parqueadero p = (Parqueadero) ois.readObject();

            ois.close();

            return p;

        } catch (Exception e) {

            System.out.println("No existe archivo");

            return null;
        }
    }
}
