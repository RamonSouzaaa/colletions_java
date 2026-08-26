package br.com.set.cadastro_produtos;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;
        
public class ListProduct {
    
    private Set<Product> list;
    
    public ListProduct() {
        this.list = new HashSet<>();
    }
    
    public void add(Product product) {
        this.list.add(product);
    }
    
    public Set<Product> orderProductByName() {
        Set<Product> filteredList = new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.name().compareToIgnoreCase(p2.name());
            }
        });
        
        filteredList.addAll(this.list);
        return filteredList;
    }
    
    public Set<Product> orderProductByPrice() {
        Set<Product> filteredList = new TreeSet<>(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price(), p2.price());
            }
        });
        
        filteredList.addAll(this.list);
        return filteredList;
    }
}
