package br.com.list.catalogo_livros;

import java.util.List;
import java.util.ArrayList;

public class CatalogBook {
    
    private final List<Book> list;
    
    public CatalogBook() {
        this.list = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        this.list.add(book);
    }
    
    public List<Book> getAllBooks() {
        return this.list;
    }
    
    public List<Book> searchByAuthor(Author author) {
        List<Book> filteredList = new ArrayList<>();
        
        if(!this.list.isEmpty()) {
            this.list.forEach(book -> {
                if(book.getAuthor().getName().equalsIgnoreCase(author.getName())) {
                    filteredList.add(book);
                }
            });
        }
        
        return filteredList;
    }
    
    public List<Book> searchByIntervalPublishYear(int initYear, int finalYear){
        List<Book> filteredList = new ArrayList<>();
        
        if(!this.list.isEmpty()) {
            this.list.forEach(book -> {
                if((book.getYearPublish() >= initYear) && (book.getYearPublish() <= finalYear)) {
                    filteredList.add(book);
                }
            });
        }
        
        return filteredList;
    }
    
    public Book searchByTitle(String title){
        Book bookFiltered = null;
        
        if(!this.list.isEmpty()) {
           for(Book item : this.list) {
                if(item.getTitle().equalsIgnoreCase(title)) {
                   bookFiltered = item;
                   break;
                }
            }
        }
        
        if(bookFiltered == null) {
            throw new IllegalArgumentException("Livro não encontrado!");
        }
        
        return bookFiltered;
    }
}