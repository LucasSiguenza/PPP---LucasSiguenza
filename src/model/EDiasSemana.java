package model;

import java.time.LocalDate;
import java.time.DayOfWeek;


public enum EDiasSemana {

    LUNES(DayOfWeek.MONDAY),
    MARTES(DayOfWeek.TUESDAY),
    MIERCOLES(DayOfWeek.WEDNESDAY),
    JUEVES(DayOfWeek.THURSDAY),
    VIERNES(DayOfWeek.FRIDAY),
    SABADO(DayOfWeek.SATURDAY),
    DOMINGO(DayOfWeek.SUNDAY);

    private DayOfWeek dia;

    public DayOfWeek getDia() {
        return dia;
    }
    
    EDiasSemana(DayOfWeek dia){
        this.dia = dia;
    }
    
    public static EDiasSemana diaActual(LocalDate fecha){
        DayOfWeek dia = fecha.getDayOfWeek();
        for(EDiasSemana diaEnum : EDiasSemana.values()){
            if(diaEnum.getDia() == dia){
                return diaEnum;
            }
        }
        throw new IllegalArgumentException("No se encontró un día coincidente a la fecha");
    }
}
