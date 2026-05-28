/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daigo
 */
import java.io.Serializable;

public class Ticket implements Serializable {

    private int numeroTicket;
    private int horaEntrada;
    private int horaSalida;
    private boolean activo;
    private Vehiculo vehiculoAsociado;

    public Ticket(int numeroTicket, int horaEntrada, Vehiculo vehiculoAsociado) {
        this.numeroTicket = numeroTicket;
        this.horaEntrada = horaEntrada;
        this.vehiculoAsociado = vehiculoAsociado;
        this.activo = true;
    }

    public int calcularHorasPermanencia() {
        return horaSalida - horaEntrada;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Vehiculo getVehiculoAsociado() {
        return vehiculoAsociado;
    }
}
