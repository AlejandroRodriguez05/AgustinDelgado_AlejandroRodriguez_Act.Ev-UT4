/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import model.reserva;
import model.habitacion;
import model.EstadoDeHabitacion;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author AlumnadoTarde
 */
public class GestorHotel {

    private static List<reserva> listaReservas = new ArrayList<>();

    // Método para agregar una reserva a la lista
    public static void guardarReserva(reserva nuevaReserva) {
        if (verificarReservas(nuevaReserva.getClientereserva())) {
            System.out.println("\nError: Un cliente solo puede tener un maximo de 3 reservas activas al mismo tiempo.\n");
        } else {
            listaReservas.add(nuevaReserva);

            // Cambiar el estado de la habitación seleccionada a RESERVADA
            for (habitacion h : habitacion.listaHabitaciones) {
                if (h.getNumerohabitacion() == nuevaReserva.getHabitacionreservada()) {
                    h.setEstado_Reservada(EstadoDeHabitacion.RESERVADA);
                    break; //Salimos del bucle cuando se encuentre la habitacion.
                }
            }
            System.out.println("Reserva guardada con exito.");
        }
    }

    // Método para verificar si un cliente tiene 3 reservas activas
    private static boolean verificarReservas(String cliente) {
        int reservasActivas = 0;

        // Recorremos las reservas y contamos las que están activas para el cliente
        for (reserva r : listaReservas) {
            // Una reserva se considera activa si el cliente es el mismo y la fecha actual está dentro del rango de la reserva
            if (r.getClientereserva().equals(cliente) & r.getCheckout().isAfter(LocalDate.now())) {
                reservasActivas++;
            }
        }

        // Si el cliente ya tiene 3 reservas activas, no puede hacer una nueva reserva
        return reservasActivas >= 3;
    }

    public static void CancelarReserva(String cliente, int NumHabitacion) {
        boolean reservaCancelada = false;

        // Recorremos la lista de reservas
        for (reserva r : listaReservas) {
            // Verificamos si la reserva es del cliente y si la fecha de checkin no ha llegado a hoy
            if (r.getClientereserva().equals(cliente) & r.getHabitacionreservada()== NumHabitacion) {
                if (r.getCheckin().isAfter(LocalDate.now())) {
                    listaReservas.remove(r);
                    reservaCancelada = true;

                    // Cambiar el estado de la habitación a DISPONIBLE después de cancelar la reserva
                    for (habitacion h : habitacion.listaHabitaciones) {
                        if (h.getNumerohabitacion() == r.getHabitacionreservada()) {
                            h.setEstado_Disponible(EstadoDeHabitacion.DISPONIBLE);
                            break;
                        }
                    }

                    System.out.println("Reserva cancelada con éxito.");
                    break;
                } else {
                    System.out.println("Error: Ya ha comenzado el Checkin, no se puede cancelar la reserva.");
                    break;
                }
            }
        }

        if (reservaCancelada == false) {
            System.out.println("Error: No se ha encontrado la reserva que desea cancelar.");
        }
    }

    public static void MostrarReserva() {
        for (reserva r : listaReservas) {
            System.out.println(r.getClientereserva() + ": " + r.getHabitacionreservada());
        }
    }

}
