package br.com.map.estoque_produtos;

public class App {
    
    public static void main(String[] args) {
        
        ListProduct lp = new ListProduct();
        
        lp.add(1, new Product(1, "Teclado", 3, 50.0));
        lp.add(2, new Product(2, "Mouse", 2, 30.0));
        lp.add(3, new Product(3, "Monitor", 5, 199.99));
        lp.add(4, new Product(4, "Notebook", 6, 599.99));
        
        lp.getAll();
        System.out.println(lp.getProductMoreCheap());
        System.out.println(lp.getProductMoreExpensive());
        System.out.println(lp.getTotalStock());
    }
}
