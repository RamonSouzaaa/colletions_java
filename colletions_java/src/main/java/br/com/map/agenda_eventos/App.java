package br.com.map.agenda_eventos;

import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {
     
        ListEvent le = new ListEvent();
        
        le.add(new Event(LocalDate.of(2025, Month.JULY, 15), "Evento 1", "Atração 1"));
        le.add(new Event(LocalDate.of(2026, Month.NOVEMBER, 20), "Evento 2", "Atração 2"));
        le.add(new Event(LocalDate.of(2000, Month.JANUARY, 6), "Evento 3", "Atração 3"));
        le.add(new Event(LocalDate.of(2026, Month.OCTOBER, 11), "Evento 4", "Atração 4"));
        
        le.getAllByOrderAsc();
        System.out.println(le.getNextEvent());
    }
}
