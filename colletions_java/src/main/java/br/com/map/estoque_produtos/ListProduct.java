package br.com.map.estoque_produtos;

import java.util.Map;
import java.util.HashMap;

public class ListProduct {
    private final int CHEAP = 1;
    private final int EXPENSIVE = 2;
    
    private Map<Integer, Product> list;
    
    public ListProduct() {
        this.list = new HashMap<>();
    }
    
    public void add(int key, Product product) {
        this.list.put(key, product);
    }
    
    public void getAll() {
        this.list.forEach((key, value) -> {
            System.out.println("[" + key + "][" + value + "]");
        });
    }
    
    public double getTotalStock() {
        if(this.list.isEmpty()) return 0;
        
        double sum = 0;
        
        for(Product product : this.list.values()) {
            sum += product.price() * product.amount();
        }
        
        return sum;
    }
    
    public Product getProductMoreTotalStock() {
        if(this.list.isEmpty()) return null;
        
        Product productFiltered = null;
        double sumProduct = 0;
        double sumProductFiltered = 0;
        
        for(Product product : this.list.values()) {
            if (productFiltered == null) productFiltered = product;
            
            sumProduct = product.price() * product.amount();
            sumProductFiltered = productFiltered.price() * productFiltered.amount();
                    
            if(sumProduct > sumProductFiltered) productFiltered = product;
        }
        
        return productFiltered;
    }
    
    private Product getProductByPrice(int type) {
        if(this.list.isEmpty()) return null;
        
        Product productFiltered = null;
        
        for(Product product : this.list.values()) {
            
            if (productFiltered == null) productFiltered = product;
            
            switch(type) {
                case CHEAP:
                    if(product.price() < productFiltered.price()) productFiltered = product;
                    break;
                case EXPENSIVE:
                    if(product.price() > productFiltered.price()) productFiltered = product;
                    break;
                default: break;
            }
        }
        
        return productFiltered;
    }
    
    public Product getProductMoreCheap() {
        return this.getProductByPrice(CHEAP);
    }
    
    public Product getProductMoreExpensive() {
        return this.getProductByPrice(EXPENSIVE);
    }
}