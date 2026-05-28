/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author daigo
 */

import java.io.Serializable;

public class Vehiculo implements Serializable {

    private String placa;
    private String marca;
    private String tipo;

    public Vehiculo(String placa, String marca, String tipo) {
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarDatos() {
        System.out.printf("Placa: %s\nMarca: %s\nTipo: %s\n",placa,marca,tipo);
        
    }
}
