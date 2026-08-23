package br.com.list.catalogo_livros;

import java.util.List;
import java.util.ArrayList;

public class Author {
    
    private String name;
    private List<Book> books;

    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public void removeBook(Book book) {
        this.books.removeIf(item -> item.getTitle() == book.getTitle());
    }
    
    @Override
    public String toString() {
        return "[" + "name=" + this.name + "]";
    }
}
