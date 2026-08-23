package br.com.list.catalogo_livros;

public class App {
    public static void main(String[] args) {
        
        Author a1 = new Author("Autor 1");
        Author a2 = new Author("Autor 2");
        Author a3 = new Author("Autor 3");
        
        Book ba11 = new Book("Book A11", a1, 1998);
        Book ba12 = new Book("Book A12", a1, 2004);
        Book ba13 = new Book("Book A13", a1, 2017);
        
        Book ba21 = new Book("Book A21", a2, 2009);
        Book ba22 = new Book("Book A22", a2, 2018);
        Book ba23 = new Book("Book A23", a2, 2024);
        
        Book ba31 = new Book("Book A31", a3, 1996);
        Book ba32 = new Book("Book A32", a3, 2002);
        Book ba33 = new Book("Book A33", a3, 2015);
        
        CatalogBook cb = new CatalogBook();
        
        cb.addBook(ba11);
        cb.addBook(ba12);
        cb.addBook(ba13);
        
        cb.addBook(ba21);
        cb.addBook(ba22);
        cb.addBook(ba23);
        
        cb.addBook(ba31);
        cb.addBook(ba32);
        cb.addBook(ba33);
        
        //cb.getAllBooks().forEach(System.out::println);
        //cb.searchByAuthor(a2).forEach(System.out::println);
        //cb.searchByIntervalPublishYear(1990, 2005).forEach(System.out::println);
        System.out.println(cb.searchByTitle("Livro 1").toString());
        
    }
}
