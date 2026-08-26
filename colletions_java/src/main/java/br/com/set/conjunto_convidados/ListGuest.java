package br.com.set.conjunto_convidados;

import java.util.Set;
import java.util.HashSet;

public class ListGuest {
    
    private Set<Guest> list;
    
    public ListGuest() {
        this.list = new HashSet<>();
    }
    
    public void add(Guest guest) {
        this.list.add(guest);
    }
    
    public void remove(int id) {
        this.list.removeIf(guest -> guest.id() == id);
    }
    
    public int count() {
        return this.list.size();
    }
    
    public void getAll() {
        this.list.forEach(System.out::println);
    }
}
