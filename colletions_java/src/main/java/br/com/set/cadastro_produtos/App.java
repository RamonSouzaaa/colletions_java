package br.com.set.cadastro_produtos;

public class App {

    public static void main(String[] args) {
        
        ListProduct lp = new ListProduct();
        
        lp.add(new Product(1, "Mouse", 10.00, 3));
        lp.add(new Product(2, "Teclado", 50.00, 5));
        lp.add(new Product(3, "Monitor", 375.99, 4));
        lp.add(new Product(4, "Fone USB", 199.99, 7));
        
        //lp.orderProductByName().forEach(System.out::println);
        lp.orderProductByPrice().forEach(System.out::println);
    }
}
