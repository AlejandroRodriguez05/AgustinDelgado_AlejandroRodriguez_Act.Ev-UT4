/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AlumnadoTarde
 */
public class cliente {
    
    //atributos
    private static int contador_ID=0;
    private int ID;
    private String NombreCompleto;
    private int Historial_Reservas_Pasadas;
    private int Reservas_Actuales;
    
    //constructor

    public cliente(String NombreCompleto, int Reservas_Actuales) {
        contador_ID++;
        this.ID = contador_ID;
        this.NombreCompleto = NombreCompleto;
        this.Reservas_Actuales = Reservas_Actuales;
    }
    
    //Getter

    public int getID() {
        return ID;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public int getHistorial_Reservas_Pasadas() {
        return Historial_Reservas_Pasadas;
    }

    public int getReservas_Actuales() {
        return Reservas_Actuales;
    }
    
    //Setter

    public void setHistorial_Reservas_Pasadas(int Historial_Reservas_Pasadas) {
        this.Historial_Reservas_Pasadas = Historial_Reservas_Pasadas;
    }

    public void setReservas_Actuales(int Reservas_Actuales) {
        this.Reservas_Actuales = Reservas_Actuales;
    }
    
}
