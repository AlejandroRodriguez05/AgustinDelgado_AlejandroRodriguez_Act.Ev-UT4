/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import model.cliente;
import model.reserva;
import java.util.List;
import model.habitacion;
import model.TipoDeHabitacion;
import model.EstadoDeHabitacion;

/**
 *
 * @author AlumnadoTarde
 */
public class GestorHotel {

    private static List<reserva> listaReservas = new ArrayList<>();
    private static List<habitacion> listaHabitaciones = new ArrayList<>();

    // Método para agregar una nueva habitación a la lista
    public static void agregarHabitacion(habitacion nuevaHabitacion) {
        // Verificamos si la habitación ya existe en la lista
        for (habitacion h : listaHabitaciones) {
            if (h.getNumerohabitacion() == nuevaHabitacion.getNumerohabitacion()) {
                return;
            }
        }
        listaHabitaciones.add(nuevaHabitacion);
    }

    // Método para buscar una habitación por número
    public static habitacion buscarHabitacionPorNumero(int numero) {
        for (habitacion h : listaHabitaciones) {
            if (h.getNumerohabitacion() == numero) {
                System.out.println("NumeroHabitacion: "+h.getNumerohabitacion()+ ": Precio: " + h.getPrecionoche()+ ": tipo: " +h.getTipo()+ ": Estado: " +h.getEstado());
                return h;
            }
        }
        return null;
    }

    // Método para buscar habitaciones por tipo
    public static habitacion buscarHabitacionesPorTipo(TipoDeHabitacion tipo) {
        
        for (habitacion h : listaHabitaciones) {
            if (h.getTipo() == tipo) {
                System.out.println("NumeroHabitacion: "+h.getNumerohabitacion()+ ": Precio: " + h.getPrecionoche()+ ": tipo: " +h.getTipo()+ ": Estado: " +h.getEstado());
            }
        }
        return null;
    }

    public static habitacion BuscarEstadoHabitacion(EstadoDeHabitacion estado) {
        for (habitacion h : listaHabitaciones) {
            if (h.getEstado()==estado) {
                System.out.println("NumeroHabitacion: "+h.getNumerohabitacion()+ ": Precio: " + h.getPrecionoche()+ ": tipo: " +h.getTipo()+ ": Estado: " +h.getEstado());
            }
        }
        return null;
    }

    // Método para agregar una reserva a la lista
    public static void guardarReserva(reserva nuevaReserva) {
        if (verificarReservas(nuevaReserva.getClientereserva())) {
            System.out.println("\nError: Un cliente solo puede tener un maximo de 3 reservas activas al mismo tiempo.\n");
        } else {
            listaReservas.add(nuevaReserva);
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

    public static void MostrarReserva() {
        for (reserva r : listaReservas) {
            System.out.println(r.getClientereserva() + ": " + r.getHabitacionreservada());
        }
    }

}
