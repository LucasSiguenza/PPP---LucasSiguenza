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
public class Gastronomia extends Servicio {

    private String gastronomia;
    private double precio;
    private EDiasSemana DiaSemDesc;

    public String getGastronomia() {
        return gastronomia;
    }

    public void setGastronomia(String gastronomia) {
        this.gastronomia = gastronomia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EDiasSemana getDiaSemDesc() {
        return DiaSemDesc;
    }

    public void setDiaSemDesc(EDiasSemana DiaSemDesc) {
        this.DiaSemDesc = DiaSemDesc;
    }

    public Gastronomia(String gastronomia, double precio, EDiasSemana DiaSemDesc, String codServicio, double porcentajeDescuento, boolean enPromocion) {
        super(codServicio, porcentajeDescuento, enPromocion);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.DiaSemDesc = DiaSemDesc;
    }

    @Override
    public double CalcularPrecioFinal(LocalDate dia) {
        if (DiaSemDesc == EDiasSemana.diaActual(dia)) {
            if (super.isEnPromocion()) {
                return precio * (1-(super.porcentajeDescuento / 100));
            }
        }
        return precio;
    }
      

        @Override
        public String toString
        
            () {
        return super.toString()+
                "Gastronomia: \n" 
                + "    Comida: " + gastronomia 
                + "\n    Precio: " + precio
                + "\n    Día de la semana con descuento: " + DiaSemDesc;
        }

    }
