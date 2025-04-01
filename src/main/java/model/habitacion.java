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
    private TipoDeHabitacion tipo;
    private EstadoDeHabitacion estado;


//constructor
    public habitacion(int numerohabitacion, int precionoche, TipoDeHabitacion tipo) {
        this.numerohabitacion = numerohabitacion;
        this.precionoche = precionoche;
        this.estado = EstadoDeHabitacion.DISPONIBLE;
        this.tipo = tipo;
    }

    public int getNumerohabitacion() {
        return numerohabitacion;
    }

    public int getPrecionoche() {
        return precionoche;
    }

    public TipoDeHabitacion getTipo() {
        return tipo;
    }

    public EstadoDeHabitacion getEstado() {
        return estado;
    }

    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }

    public void setPrecionoche(int precionoche) {
        this.precionoche = precionoche;
    }

    public void setTipo(TipoDeHabitacion tipo) {
        this.tipo = tipo;
    }

    public void setEstado(EstadoDeHabitacion estado) {
        this.estado = estado;
    }

}
