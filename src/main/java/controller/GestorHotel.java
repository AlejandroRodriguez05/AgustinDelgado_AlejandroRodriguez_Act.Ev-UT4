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

    public static void resumenhabitaciones() {
        System.out.println("\n __Resumen de habitaciones__");
        for (habitacion h : listaHabitaciones) {
            System.out.println("NumeroHabitacion: " + h.getNumerohabitacion() + ": Precio: " + h.getPrecionoche() + ": tipo: " + h.getTipo() + ": Estado: " + h.getEstado());
        }
    }

    public static void resumencliesntes() {
        System.out.println("\n __Resumen de clientes__");
        for (reserva r : listaReservas) {
            System.out.println("Nombre del cliente: " + r.getClientereserva() + " habitacion reservada: " + r.getHabitacionreservada());
        }
    }

    public static void buscarReservasActivasPorCliente(String NombreCliente) {
        System.out.println("\n Reservas activas de: " + NombreCliente);
        boolean encontrado = false;

        for (reserva r : listaReservas) {
            if (r.getClientereserva().equalsIgnoreCase(NombreCliente) && r.getCheckout().isAfter(LocalDate.now())) {
                System.out.println("Habitacion: " + r.getHabitacionreservada() + " | Check-in: " + r.getCheckin() + " | Check-out: " + r.getCheckout());
                encontrado = true;
            }
        }
    }

    public static void ListarHistorialReservaCliente(String NombreCliente) {
        System.out.println("\n Reservas totales de: " + NombreCliente);
        for (reserva r : listaReservas) {
            if (r.getClientereserva().equalsIgnoreCase(NombreCliente)) {
                System.out.println("Id Reserva: " + r.getIdreserva() + " | Habitacion: " + r.getHabitacionreservada() + " | Check-in: " + r.getCheckin() + " | Check-out: " + r.getCheckout());
            }
        }
    }

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
                System.out.println("NumeroHabitacion: " + h.getNumerohabitacion() + ": Precio: " + h.getPrecionoche() + ": tipo: " + h.getTipo() + ": Estado: " + h.getEstado());
                return h;
            }
        }
        return null;
    }

    // Método para buscar habitaciones por tipo
    public static habitacion buscarHabitacionesPorTipo(TipoDeHabitacion tipo) {

        for (habitacion h : listaHabitaciones) {
            if (h.getTipo() == tipo) {
                System.out.println("NumeroHabitacion: " + h.getNumerohabitacion() + ": Precio: " + h.getPrecionoche() + ": tipo: " + h.getTipo() + ": Estado: " + h.getEstado());
            }
        }
        return null;
    }

    public static habitacion BuscarEstadoHabitacion(EstadoDeHabitacion estado) {
        for (habitacion h : listaHabitaciones) {
            if (h.getEstado() == estado) {
                System.out.println("NumeroHabitacion: " + h.getNumerohabitacion() + ": Precio: " + h.getPrecionoche() + ": tipo: " + h.getTipo() + ": Estado: " + h.getEstado());
            }
        }
        return null;
    }

    // Método para agregar una reserva a la lista
    public static void guardarReserva(reserva nuevaReserva) {
        if (verificarReservas(nuevaReserva.getClientereserva())) {
            System.out.println("\nError: Un cliente solo puede tener un maximo de 3 reservas activas al mismo tiempo.\n");
        } else {

            for (habitacion h : listaHabitaciones) {
                if (h.getNumerohabitacion() == nuevaReserva.getHabitacionreservada()) {
                    //Verifica que la habitacion no esta ya reservada
                    if (h.getEstado().equals(EstadoDeHabitacion.RESERVADA)) {
                        System.out.println("Error: Esta habitacion ya esta reservada");
                        break;
                    } else {
                        // Cambiar el estado de la habitación seleccionada a RESERVADA
                            if (h.getNumerohabitacion() == nuevaReserva.getHabitacionreservada()) {
                                h.setEstado_Reservada(EstadoDeHabitacion.RESERVADA);
                            }
                        listaReservas.add(nuevaReserva);
                        System.out.println("Reserva guardada con exito.");
                        break;
                    }
                    
                }
            }

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
            if (r.getClientereserva().equals(cliente) & r.getHabitacionreservada() == NumHabitacion) {
                if (r.getCheckin().isAfter(LocalDate.now())) {
                    listaReservas.remove(r);
                    reservaCancelada = true;

                    // Cambiar el estado de la habitación a DISPONIBLE después de cancelar la reserva
                    for (habitacion h : listaHabitaciones) {
                        if (h.getNumerohabitacion() == r.getHabitacionreservada()) {
                            h.setEstado_Disponible(EstadoDeHabitacion.DISPONIBLE);
                            break;
                        }
                    }

                    System.out.println("Reserva cancelada con exito.");
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

    public static void MostrarReservasGenerales() {
        for (reserva r : listaReservas) {
            System.out.println(r.getClientereserva() + ": " + r.getHabitacionreservada());
        }
    }

    public static void calcularPrecioTotal(reserva r) {

        LocalDate Checkin = r.getCheckin();
        LocalDate Checkout = r.getCheckout();

        // Calcular el número de noches restando los días
        int noches = (int) (Checkout.toEpochDay() - Checkin.toEpochDay());

        for (habitacion h : listaHabitaciones) {
            if (h.getNumerohabitacion() == r.getHabitacionreservada()) {
                int PrecioTotal = h.getPrecionoche() * noches;
                System.out.println("El precio total de la persona: " + r.getClientereserva() + " es de " + PrecioTotal + " euros");
            }
        }
    }
}
