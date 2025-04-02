/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package app;

import java.time.LocalDate;
import model.TipoDeHabitacion;
import model.habitacion;
import model.cliente;
import model.reserva;
import controller.GestorHotel;
import model.EstadoDeHabitacion;
import view.VistaConsola;

/**
 *
 * @author AlumnadoTarde
 */
public class Delgado_Agustin_Rodriguez_Alejandro_ActEV_UT4_Final {

    public static void main(String[] args) {
        
        VistaConsola vc = new VistaConsola();
        
        habitacion habitacion1 = new habitacion(101, 50, TipoDeHabitacion.INDIVIDUAL);
        habitacion habitacion2 = new habitacion(102, 50, TipoDeHabitacion.INDIVIDUAL);
        habitacion habitacion3 = new habitacion(103, 50, TipoDeHabitacion.INDIVIDUAL);

        habitacion habitacion4 = new habitacion(201, 80, TipoDeHabitacion.DOBLE);
        habitacion habitacion5 = new habitacion(202, 80, TipoDeHabitacion.DOBLE);
        habitacion habitacion6 = new habitacion(203, 80, TipoDeHabitacion.DOBLE);

        habitacion habitacion7 = new habitacion(301, 150, TipoDeHabitacion.SUITE);
        habitacion habitacion8 = new habitacion(302, 150, TipoDeHabitacion.SUITE);
        habitacion habitacion9 = new habitacion(303, 150, TipoDeHabitacion.SUITE);

        cliente cliente1 = new cliente("Agustin Delgado Estevez");
        cliente cliente2 = new cliente("Alejandro Rodriguez Sanchez");
        cliente cliente3 = new cliente("Pepe Vera Sosa");

        reserva reserva1 = new reserva(101, "Agustin Delgado Estevez", LocalDate.now().plusDays(10), LocalDate.now().plusDays(70));
        reserva reserva2 = new reserva(201, "Alejandro Rodriguez Sanchez", LocalDate.now().plusDays(10), LocalDate.now().plusDays(20));
        reserva reserva3 = new reserva(202, "Alejandro Rodriguez Sanchez", LocalDate.now().plusDays(10), LocalDate.now().plusDays(40));
        reserva reserva4 = new reserva(203, "Alejandro Rodriguez Sanchez", LocalDate.now().plusDays(10), LocalDate.now().plusDays(90));
        reserva reserva5 = new reserva(301, "Pepe Vera Sosa", LocalDate.now().plusDays(10), LocalDate.now().plusDays(90));
        reserva reserva6 = new reserva(303, "Alejandro Rodriguez Sanchez", LocalDate.now().plusDays(10), LocalDate.now().plusDays(90));

        //METODOS
        //Agregar Habitaciones a la lista
        GestorHotel.agregarHabitacion(habitacion1);
        GestorHotel.agregarHabitacion(habitacion2);
        GestorHotel.agregarHabitacion(habitacion3);
        GestorHotel.agregarHabitacion(habitacion4);
        GestorHotel.agregarHabitacion(habitacion5);
        GestorHotel.agregarHabitacion(habitacion6);
        GestorHotel.agregarHabitacion(habitacion7);
        GestorHotel.agregarHabitacion(habitacion8);
        GestorHotel.agregarHabitacion(habitacion9);
        
        //Guardar una reserva en el historial y mostrarlas
        vc.GuardarLasReservas();
        
        GestorHotel.guardarReserva(reserva1);
        GestorHotel.guardarReserva(reserva2);
        GestorHotel.guardarReserva(reserva3);
        GestorHotel.guardarReserva(reserva4);
        GestorHotel.guardarReserva(reserva5);
        System.out.println("");
        GestorHotel.MostrarReserva();

        
        //Verificamos la validacion de NO tener mas de 3 reservas un mismo cliente
        vc.No_Tener_Mas_De_3_Reservas();
        GestorHotel.guardarReserva(reserva6);
        
        
        //Intentamos cancelar una reserva
        vc.CancelarReserva();
        GestorHotel.CancelarReserva("Pepe Vera Sosa", 301);
        
        System.out.println("");

        GestorHotel.MostrarReserva();

        //buscar habitacion por numero
        vc.BuscarHabitacionPorNumero();
        GestorHotel.buscarHabitacionPorNumero(101);
        
        //Buscar habitacion por tipo
        vc.BuscarHabitacionPorTipo();
        GestorHotel.buscarHabitacionesPorTipo(TipoDeHabitacion.SUITE);
        
        //Buscar habitacion por Estado
        vc.BuscarHabitacionPorEstado();
        GestorHotel.BuscarEstadoHabitacion(EstadoDeHabitacion.DISPONIBLE);
        
//falta vista a partir de aqui pa bajo.
        //buscar reservas activas de un cliente
        GestorHotel.buscarReservasActivasPorCliente("Alejandro Rodriguez Sanchez");

        //listar historial de reservas de un cliente
        GestorHotel.ListarHistorialReservaCliente("Agustin Delgado Estevez");
        
        
        //resumen hatitaciones
        GestorHotel.resumenhabitaciones();
        
        //resumen de clientes
        GestorHotel.resumencliesntes();
    
    }
}
