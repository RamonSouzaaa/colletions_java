package br.com.map.agenda_eventos;

import java.time.LocalDate;

public record Event(LocalDate date,
                   String name,
                   String eventName) { }
