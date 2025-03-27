/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.delgado_agustin_rodriguez_alejandro_actev_ut4_final;

import model.TipoDeHabitacion;
import model.habitacion;

/**
 *
 * @author AlumnadoTarde
 */
public class Delgado_Agustin_Rodriguez_Alejandro_ActEV_UT4_Final {

    public static void main(String[] args) {
        habitacion habitacion1 = new habitacion(101, 50, TipoDeHabitacion.individual);
        habitacion habitacion2 = new habitacion(102, 50, TipoDeHabitacion.individual);
        habitacion habitacion3 = new habitacion(103, 50, TipoDeHabitacion.individual);

        habitacion habitacion4 = new habitacion(201, 80, TipoDeHabitacion.doble);
        habitacion habitacion5 = new habitacion(202, 80, TipoDeHabitacion.doble);
        habitacion habitacion6 = new habitacion(203, 80, TipoDeHabitacion.doble);

        habitacion habitacion7 = new habitacion(301, 150, TipoDeHabitacion.suite);
        habitacion habitacion8 = new habitacion(302, 150, TipoDeHabitacion.suite);
        habitacion habitacion9 = new habitacion(303, 150, TipoDeHabitacion.suite);
    }

}
