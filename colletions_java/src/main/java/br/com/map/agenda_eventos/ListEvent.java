package br.com.map.agenda_eventos;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.time.LocalDate;

public class ListEvent {

    private Map<LocalDate, Event> list;
    
    public ListEvent() {
        this.list = new HashMap<>();
    }
    
    public void add(Event event) {
        this.list.put(event.date(), event);
    }
    
    public void getAllByOrderAsc() {
        Map<LocalDate, Event> listFiltered = new TreeMap<>(this.list);
        listFiltered.forEach((key, value) -> {
            System.out.println("[" + key + "]:[" + value+ "]");
        });
    }
    
    public Event getNextEvent() {
        if(this.list.isEmpty()) return null;
        
        Event eventFiltered = null;
        LocalDate dateNow = LocalDate.now();
        
        for(Event event : this.list.values()) {
            if(event.date().equals(dateNow) || event.date().isAfter(dateNow)) {
                eventFiltered = event;
                break;
            }
        }
        
        return eventFiltered;
    }
}
