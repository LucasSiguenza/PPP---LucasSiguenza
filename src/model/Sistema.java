/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Sistema {

    private List<Servicio> lstServicios;

    public List<Servicio> getLstServicios() {
        return lstServicios;
    }

    public void setLstServicios(List<Servicio> lstServicios) {
        this.lstServicios = lstServicios;
    }

    public Sistema(ArrayList<Servicio> lstServicios) {
        this.lstServicios = lstServicios;
    }

    public Sistema() {
        lstServicios = new ArrayList<Servicio>();
    }

    public Servicio traerServicio(String codServicio) {
        for (Servicio srv : lstServicios) {
            if (srv.getCodServicio() == codServicio) {
                return srv;
            }
        }
        throw new IllegalArgumentException("No se encontró el servicio solicitad");
    }
    
    public List<Servicio> traerServicio(boolean enPromocion){
        List<Servicio> lstSrvProm = new ArrayList<Servicio>();
        for(Servicio srv : lstServicios){
            if(srv.isEnPromocion() == enPromocion){
                lstSrvProm.add(srv);
            }
        }
        if(lstSrvProm.isEmpty()){
            throw new NoSuchElementException("No hay productos en promoción");
        } else{
            return lstSrvProm;
        }
    }
    
    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia){
        List<Servicio> lstSrvProm = new ArrayList<Servicio>();
        for(Servicio srv : lstServicios){
            if(srv instanceof Gastronomia){
                Gastronomia srvG = (Gastronomia) srv;
                if(srvG.getDiaSemDesc() == EDiasSemana.diaActual(dia) && srvG.isEnPromocion()){
                    lstSrvProm.add(srvG);
                }
            }
        }
        if(lstSrvProm.isEmpty()){
            throw new NoSuchElementException("No hay coincidencias");
        } else{
            return lstSrvProm;
        }
    }
    
    public boolean AgregarGastronomia(String nombre, double precio, 
            EDiasSemana diaDescuento, String codigo, double porcentajeDescuento,
            boolean enPromocion){
        Gastronomia gast = new Gastronomia(nombre, precio,diaDescuento, codigo,
                porcentajeDescuento, enPromocion);
        if(lstServicios.contains(gast)){
            throw new IllegalStateException("El elemento ya se encuentra");
        }
        lstServicios.add(gast);
        return true;
    }
    public boolean agregarHospedaje(String nombre, double precioPorNoche,
            String codigo, double porcentajeDescuento, boolean enPromocion){
        Hospedaje hspdj = new Hospedaje(nombre, precioPorNoche, codigo,
            porcentajeDescuento, enPromocion);
        if(lstServicios.contains(hspdj)){
            throw new IllegalStateException("El elemento ya se encuentra");
        }
        lstServicios.add(hspdj);
        return true;
    } 

    @Override
    public String toString() {
        return "LISTA DE SERVICIOS\n\n" + lstServicios;
    }
    
    
}
