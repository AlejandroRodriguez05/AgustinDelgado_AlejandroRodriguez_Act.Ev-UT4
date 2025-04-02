/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author AlumnadoTarde
 */
public class VistaConsola {

    Scanner scanner = new Scanner(System.in);

    public void GuardarLasReservas() {
        System.out.println("\nPresione 'Enter' para continuar con: Guardar las Reservas creadas y mostrarlas");
        String respuesta = scanner.nextLine();
    }

    public void No_Tener_Mas_De_3_Reservas() {
        System.out.println("\nPresione 'Enter' para continuar con: No tener 3 Reservas o mas");
        String respuesta = scanner.nextLine();
    }
    
     public void No_Reservar_Habitacion_Reservada() {
        System.out.println("\nPresione 'Enter' para continuar con: No reservar una habitacion ya reservada");
        String respuesta = scanner.nextLine();
    }

    public void CancelarReserva() {
        System.out.println("\nPresione 'Enter' para continuar con: Cancelar la reserva de Pepe Vera Sosa");
        String respuesta = scanner.nextLine();
    }

    public void BuscarHabitacionPorNumero() {
        System.out.println("\nPresione 'Enter' para continuar con: Buscar Habitacion por numero 101");
        String respuesta = scanner.nextLine();
    }

    public void BuscarHabitacionPorTipo() {
        System.out.println("\nPresione 'Enter' para continuar con: Buscar Habitacion por tipo SUITE");
        String respuesta = scanner.nextLine();
    }

    public void BuscarHabitacionPorEstado() {
        System.out.println("\nPresione 'Enter' para continuar con: Buscar Habitacion por estado DISPONIBLE");
        String respuesta = scanner.nextLine();
    }

     public void BuscarReservasActivasPorCliente() {
        System.out.println("\nPresione 'Enter' para continuar con: Buscar Reservas Activas Por Clientes");
        String respuesta = scanner.nextLine();
    }
     public void calcularPrecioTotal() {
        System.out.println("\nPresione 'Enter' para continuar con: Calcular Precio Total de una reserva");
        String respuesta = scanner.nextLine();
    }
     public void ListarHistorialReservaCliente() {
        System.out.println("\nPresione 'Enter' para continuar con: Listar Historial de Reservas Del Cliente");
        String respuesta = scanner.nextLine();
    }
     
     public void resumenhabitaciones() {
        System.out.println("\nPresione 'Enter' para continuar con: Resumen de Habitaciones");
        String respuesta = scanner.nextLine();
    }
     
     public void resumencliesntes() {
        System.out.println("\nPresione 'Enter' para continuar con: Resumen De Clientes");
        String respuesta = scanner.nextLine();
    }
     
     
}
