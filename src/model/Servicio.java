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
public abstract class Servicio {
    protected String codServicio;
    protected double porcentajeDescuento;
    protected boolean enPromocion;

    public String getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(String codServicio) {
        this.codServicio = codServicio;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }

    public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion) {
        this.codServicio = codServicio;
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
    }
    
    public abstract double CalcularPrecioFinal(LocalDate dia);

    @Override
    public String toString() {
        return "Información adicional\n" + "    Código del servicio: " + codServicio 
                + "\n    Porcentaje de Descuento: " + porcentajeDescuento + 
                "\n    Está en promoción: " + enPromocion +"\n";
    }
    
    
}
