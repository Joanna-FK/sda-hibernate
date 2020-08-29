package examples.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "client")
    Set<Book> books = new HashSet<>();

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        this.books.add(book);
        book.setClient(this);

    }

    public Set <Book> getBooks() {
        return Collections.unmodifiableSet(books);
    }

}
