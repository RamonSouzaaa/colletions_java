package br.com.map.agenda_contatos;

import java.util.Map;
import java.util.HashMap;

public class ListContact {
    
    private Map<String, Integer> list;
    
    public ListContact() {
        this.list = new HashMap<>();
    }
    
    public void add(String name, Integer number){
        this.list.put(name, number);
    }
    
    public void remove(String name) {
        if(this.list.isEmpty()) return;
        this.list.remove(name);
    }
    
    public void getAll() {
        this.list.forEach((key, value) -> {
            System.out.println("[" + key + "]:[" + value + "]"); 
        });
    }
    
    public Integer searchByKey(String key) {
        if(this.list.isEmpty()) return null;
        return this.list.get(key);
   }
}
