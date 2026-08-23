package br.com.list.catalogo_livros;

public class Book {
    
    private String title;
    private Author author;
    private int yearPublish;
    
    public Book() {}
    
    public Book(String title,
                Author author,
                int yearPublish) {
        this.title = title;
        this.author = author;
        this.yearPublish = yearPublish;
        
        this.author.addBook(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return "[Title=" + this.title + 
                ", author=" + (this.author != null ? this.author.getName() : "Sem autor") + 
                ", yearPublish=" + this.yearPublish + "]";
    }
}
