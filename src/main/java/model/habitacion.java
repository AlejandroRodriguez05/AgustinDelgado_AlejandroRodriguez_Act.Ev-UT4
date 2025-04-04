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

    //Getter
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

    //Setter
    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }

    public void setPrecionoche(int precionoche) {
        this.precionoche = precionoche;
    }

    public void setTipo(TipoDeHabitacion tipo) {
        this.tipo = tipo;
    }

    public void setEstado_Disponible(EstadoDeHabitacion estado) {
        this.estado = EstadoDeHabitacion.DISPONIBLE;
    }

    public void setEstado_Ocupada(EstadoDeHabitacion estado) {
        this.estado = EstadoDeHabitacion.OCUPADA;
    }

    public void setEstado_Reservada(EstadoDeHabitacion estado) {
        this.estado = EstadoDeHabitacion.RESERVADA;
    }

}
