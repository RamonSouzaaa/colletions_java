package br.com.set.agenda_contatos;

public class App {
    
    public static void main(String[] args) {
        ListContact lc = new ListContact();
        
        lc.add(new Contact("Maria Vizinha", 1000));
        lc.add(new Contact("Maria Trabalho", 2000));
        lc.add(new Contact("João Primo", 3000));
        lc.add(new Contact("Seu João porteiro", 4000));
        lc.add(new Contact("José", 5000));
        lc.add(new Contact("José Maria", 6000));
        
        
        //lc.searchByName("maria").forEach(System.out::println);
        lc.updateNumber(2000, 7000);
        lc.getAll();
    }
}
