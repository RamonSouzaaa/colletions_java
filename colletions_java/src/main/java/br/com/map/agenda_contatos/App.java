package br.com.map.agenda_contatos;

public class App {
    
    public static void main(String[] args) {
        
        ListContact lc = new ListContact();
        lc.add("Maria Trabalho", 1000);
        lc.add("Maria Vizinha", 2000);
        lc.add("João porteiro", 3000);
        lc.add("José", 4000);
        lc.add("Pai", 5000);
        lc.add("Mãe", 6000);
        
        lc.remove("Maria Trabalho");
        lc.getAll();
        System.out.println(lc.searchByKey("Pai"));
    }
}
