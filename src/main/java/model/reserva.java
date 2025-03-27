/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author AlumnadoTarde
 */
public class reserva {

    //atributos
    private int contadorid = 0;
    private int idreserva;
    private int habitacionreservada;
    private String Clientereserva;
    private LocalDate checkin;
    private LocalDate checkout;
    
//constructor
    public reserva(int habitacionreservada, String Clientereserva, LocalDate checkin, LocalDate checkout) {
        contadorid++;
        this.idreserva = contadorid;
        this.habitacionreservada = habitacionreservada;
        this.Clientereserva = Clientereserva;
        this.checkin = checkin;
        this.checkout = checkout;
    }

//getter
    public int getIdreserva() {
        return idreserva;
    }

    public int getHabitacionreservada() {
        return habitacionreservada;
    }

    public String getClientereserva() {
        return Clientereserva;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

//setter
    public void setContadorid(int contadorid) {
        this.contadorid = contadorid;
    }

    public void setHabitacionreservada(int habitacionreservada) {
        this.habitacionreservada = habitacionreservada;
    }

    public void setClientereserva(String Clientereserva) {
        this.Clientereserva = Clientereserva;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

}
