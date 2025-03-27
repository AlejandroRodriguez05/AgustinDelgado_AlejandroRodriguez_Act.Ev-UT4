/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AlumnadoTarde
 */
public class habitacion {

    //atributos
    private int numerohabitacion;
    private int precionoche;
    private tipo tipo;
    private estado estado;

//enum tipo
    private enum tipo {
        individual, doble, suite;
    }
//enum estado

    private enum estado {
        disponible, reservado, ocupada;
    }

//constructor
    public habitacion(int numerohabitacion, int precionoche, tipo tipo, estado estado) {
        this.numerohabitacion = numerohabitacion;
        this.precionoche = precionoche;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getNumerohabitacion() {
        return numerohabitacion;
    }

    public int getPrecionoche() {
        return precionoche;
    }

    public tipo getTipo() {
        return tipo;
    }

    public estado getEstado() {
        return estado;
    }

    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }

    public void setPrecionoche(int precionoche) {
        this.precionoche = precionoche;
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }

}
