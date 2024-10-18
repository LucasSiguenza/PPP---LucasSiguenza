/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import model.EDiasSemana;
import model.Gastronomia;
import model.Sistema;
import model.Servicio;
import model.Hospedaje;

public class Main {

    public static void main(String[] args) {
        try{
            System.out.println("1-1");

            Gastronomia gst1 = new Gastronomia("Hamburguesa Criolla", 180.0,
                    EDiasSemana.JUEVES, "4892", 15.0, true);
            System.out.println(gst1+"\n");

            System.out.println("1-2");

            Gastronomia gst2 = new Gastronomia("Hamburguesa Criolla", 180.0,
                    EDiasSemana.JUEVES, "489235", 15.0, true);
            System.out.println(gst2+"\n");

            System.out.println("1-3");

            Hospedaje hsp1 = new Hospedaje("Cabaña 3 personas", 1500, "2872", 10.0,
                    true);
            System.out.println(hsp1+"\n");

            System.out.println("1-4");

            Hospedaje hsp2 = new Hospedaje("Cabaña 3 personas", 1500, "287282", 10.0,
                    true);
            System.out.println(hsp2+"\n");

            System.out.println("2-1");
            LocalDate dia1 = LocalDate.of(2024, Month.OCTOBER, 28);
            System.out.println(hsp1.CalcularPrecioFinal(dia1)+"\n");

            System.out.println("2-2");
            LocalDate dia2 = LocalDate.of(2024, Month.OCTOBER, 27);
            System.out.println(hsp1.CalcularPrecioFinal(dia2)+"\n");

            System.out.println("3-1");
            Sistema sist = new Sistema();
            sist.AgregarGastronomia("Milanesa con puré", 350, EDiasSemana.MIERCOLES, "858927", 15, true);
            sist.agregarHospedaje("Habitación Triple", 2200, "489259", 10, true);
            sist.AgregarGastronomia("Gaseosa", 120.0, EDiasSemana.MIERCOLES, "182835", 20, false);
            sist.agregarHospedaje("Habitación simple", 1000.0, "758972", 15.0, false);
            System.out.println(sist);

            System.out.println("4-1");
            ArrayList<Servicio> lstProm = (ArrayList<Servicio>) sist.traerServicio(true);
            Sistema sist2= new Sistema(lstProm);
            System.out.println(sist2);

            System.out.println("4-2");
            ArrayList<Servicio> lstProm2 = (ArrayList<Servicio>) sist.traerServicio(true, dia2);
            Sistema sist3= new Sistema(lstProm2);
            System.out.println(sist3);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
