/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daigo
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Parqueadero p = new Parqueadero("Central", 10);


        System.out.println(" REGISTRO DE INGRESO ");

        System.out.println("Ingrese placa:");
        String placa = sc.nextLine();

        System.out.println("Ingrese marca:");
        String marca = sc.nextLine();

        System.out.println("Ingrese tipo (Auto/Moto):");
        String tipo = sc.nextLine();

        System.out.println("Ingrese hora de entrada:");
        int horaEntrada = sc.nextInt();

        Vehiculo v = new Vehiculo(placa, marca, tipo);

        p.registrarIngreso(v, horaEntrada);

        sc.nextLine();

   
        System.out.println("\n REGISTRO DE SALIDA ");

        System.out.println("Ingrese placa del vehículo:");
        String placaSalida = sc.nextLine();

        System.out.println("Ingrese hora de salida:");
        int horaSalida = sc.nextInt();

        p.procesarSalida(placaSalida, horaSalida);

        
        GestorArchivo.guardarEstado(p);

        System.out.println("\nDatos guardados correctamente");
    }
}
