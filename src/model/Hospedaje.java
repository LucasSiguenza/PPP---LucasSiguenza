/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Hospedaje extends Servicio {

    private String hospedaje;
    private double precioPorNoche;

    public String getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(String hospedaje) {
        this.hospedaje = hospedaje;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public Hospedaje(String hospedaje, double precioPorNoche, String codServicio,
            double porcentajeDescuento, boolean enPromocion) {
        super(codServicio, porcentajeDescuento, enPromocion);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public double CalcularPrecioFinal(LocalDate dia) {
        EDiasSemana diaActual = EDiasSemana.diaActual(dia);
        if(diaActual != EDiasSemana.DOMINGO && diaActual != EDiasSemana.SABADO){
            return (1.00-(super.porcentajeDescuento/100)) * precioPorNoche;
        }
        return precioPorNoche;
    }

    @Override
    public String toString() {
        return super.toString() + "Hospedaje:\n" + "   Nombre del Hospedaje: " + hospedaje + 
                "\n   Precio por noche: " + precioPorNoche;
    }
    
    
}
