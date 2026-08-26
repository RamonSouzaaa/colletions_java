package br.com.set.conjunto_convidados;

public class App {
    public static void main(String[] args) {
        ListGuest lg = new ListGuest();
        
        lg.add(new Guest("g1", 1));
        lg.add(new Guest("g3", 2));
        lg.add(new Guest("g2", 3));
        
        System.out.println(lg.count());
        
        lg.remove(2);
        
        lg.getAll();
    }
}
