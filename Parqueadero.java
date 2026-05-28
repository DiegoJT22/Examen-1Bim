/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daigo
 */
import java.io.Serializable;

public class Parqueadero implements Serializable {

    private String nombre;
    private Ticket[] listaTickets;
    private int capacidadMaxima;
    private int contadorTickets;

    public Parqueadero(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        listaTickets = new Ticket[capacidadMaxima];
        contadorTickets = 0;
    }

    public void registrarIngreso(Vehiculo veh, int horaEntrada) {

        if (contadorTickets < capacidadMaxima) {

            Ticket t = new Ticket(contadorTickets + 1, horaEntrada, veh);

            listaTickets[contadorTickets] = t;

            contadorTickets++;

            System.out.println("Ingreso registrado");
        } else {
            System.out.println("Parqueadero lleno");
        }
    }

    public Ticket buscarTicketPorPlaca(String placa) {

        for (int i = 0; i < contadorTickets; i++) {

            if (listaTickets[i].isActivo() &&
                    listaTickets[i].getVehiculoAsociado().getPlaca().equals(placa)) {

                return listaTickets[i];
            }
        }

        return null;
    }

    public void procesarSalida(String placa, int horaSalida) {

        Ticket t = buscarTicketPorPlaca(placa);

        if (t != null && t.isActivo()) {

            if (horaSalida < t.getHoraEntrada()) {
                System.out.println("Error: cambio de día no soportado");
                return;
            }

            t.setHoraSalida(horaSalida);

            int horas = t.calcularHorasPermanencia();

            double total = 0;

            if (t.getVehiculoAsociado().getTipo().equalsIgnoreCase("Auto")) {
                total = horas * 2;
            } else if (t.getVehiculoAsociado().getTipo().equalsIgnoreCase("Moto")) {
                total = horas * 1;
            }

            if (horas > 5) {
                total = total - (total * 0.10);
            }

            t.setActivo(false);

            System.out.println("Horas: " + horas);
            System.out.println("Total a pagar: $" + total);

        } else {
            System.out.println("Ticket no encontrado");
        }
    }
}
