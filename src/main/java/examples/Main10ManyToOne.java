package examples;

import examples.entity.Book;
import examples.entity.Client;
import examples.entity.Husband;
import examples.entity.Wife;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main10ManyToOne {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Client client = new Client("Marian");
        client.addBook(new Book("Harry Potter 1"));
        client.addBook(new Book("Harry Potter 2"));
        client.addBook(new Book("Harry Potter 3"));
        Client client1 = new Client("Jan");
        client.addBook(new Book("Harry Potter 4"));
        client.addBook(new Book("Harry Potter 5"));
        client.addBook(new Book("Harry Potter 6"));

        session.persist(client);
        session.persist(client1);


        transaction.commit();
        session.close();
    }
}
