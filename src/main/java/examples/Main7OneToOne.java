package examples;

import examples.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Date;

public class Main7OneToOne {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(new Husband("Bartek", new Wife("Sabrnia")));
        session.persist(new Husband("Jan", new Wife("Maria")));
        session.persist(new Husband("Lukasz", new Wife("Jola")));
        session.persist(new Husband("Karol", new Wife("Ala")));
        session.persist(new Husband("Mateusz", new Wife("Marta")));

        transaction.commit();
        session.close();
    }

}
