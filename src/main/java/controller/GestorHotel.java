/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import model.cliente;
import model.reserva;
import java.util.List;
/**
 *
 * @author AlumnadoTarde
 */
public class GestorHotel {

    // Método para hacer una nueva reserva (ejemplo de uso)
    public String hacerReserva(cliente cliente, List<reserva> reservas, int Num_Habitacion, LocalDate checkin, LocalDate checkout) {
        if (verificarReservasActivas(cliente, reservas)==true) {
            reservas.add(new reserva(Num_Habitacion, cliente.getNombreCompleto(), checkin, checkout));
            
            return "Reserva realizada con éxito.";
        } else {
            return "No puedes tener más de 3 reservas activas al mismo tiempo.";
        }
    }
    
        // Método que verifica si un cliente tiene más de 3 reservas activas
    public boolean verificarReservasActivas(cliente cliente, List<reserva> reservas) {
        int reservasActivas = 0;

        // Revisa la lista para saber cuantas reservas estan activas
        for (reserva reserva : reservas) {
            // Verificar si la reserva está activa
            if (reserva.getClientereserva().equals(cliente.getNombreCompleto()) & reserva.getCheckout().isAfter(LocalDate.now())) {
                reservasActivas++;
            }
        }
        return reservasActivas <= 3;
    }
}