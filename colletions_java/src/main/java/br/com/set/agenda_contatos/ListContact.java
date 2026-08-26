package br.com.set.agenda_contatos;

import java.util.Set;
import java.util.HashSet;

public class ListContact {
    
    private final Set<Contact> list;
    
    public ListContact() {
        this.list = new HashSet<>();
    }
    
    public void add(Contact contact) {
        this.list.add(contact);
    }
    
    public void getAll() {
        this.list.forEach(System.out::println);
    }
    
    public Set<Contact> searchByName(String name) {
        Set<Contact> filteredList = new HashSet<>();
                
        this.list.forEach(contact -> {
            if(contact.name()
               .toLowerCase()
               .contains(name.toLowerCase())) filteredList.add(contact);
        });
        
        return filteredList;
    }
    
    public Contact getContactByNumber(int number) {
        Contact contactFiltered = null;
        
        for(Contact contact : this.list){
            if(contact.number() == number) {
                contactFiltered = contact;
                break;
            }
        }
        
        return contactFiltered;
    }
    
    public void updateNumber(int oldNumber, int newNumber) {
        Contact contact = this.getContactByNumber(oldNumber);
        
        if(this.getContactByNumber(newNumber) != null) throw new IllegalArgumentException("Este número já existe para outro contato!");
        
        if(contact != null){
            this.list.remove(contact);
            this.list.add(new Contact(contact.name(), newNumber));
        } else {
            throw new IllegalArgumentException("Contato não encontrado!");
        }
    }
}
